from __future__ import print_function

import boto3
import json

print('Loading function')


def lambda_handler(event, context):
    # '''Provide an event that contains the following keys:

    #   - operation: one of the operations in the operations dict below
    #   - tableName: required for operations that interact with DynamoDB
    #   - payload: a parameter to pass to the operation being performed
    # '''
    #   print("Received event: " + json.dumps(event, indent=2))

    # operation = event['operation']

    # if 'tableName' in event:
    dynamo = boto3.resource('dynamodb').Table('References')
    operation = "create"
    operations = {
        'create': lambda x: dynamo.put_item(**x)
    }

    # print(operation)
    #if operation in operations:
    return operations[operation](event.get('payLoad'))
    # else:
    #     raise ValueError('Unrecognized operation "{}"'.format(operation))

    # return dynamo.put_item(event.get('payLoad'))
