from __future__ import print_function

import boto3
import json
import decimal
from boto3.dynamodb.conditions import Key, Attr

print('Loading function')

def decimal_default(obj):
    if isinstance(obj, decimal.Decimal):
        return float(obj)

def lambda_handler(event, context):

    dynamo = boto3.resource('dynamodb').Table("Restaurants")

    searchKey = event['search']

    fe = Key('rName').contains(searchKey)

    pe = 'rName, numPeople, waitTime'

    return json.dumps(dynamo.scan(ProjectionExpression=pe, FilterExpression=fe), default=decimal_default)
   
