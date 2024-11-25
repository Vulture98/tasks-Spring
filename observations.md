

# learn
wts jpa

to connect to db u need jpa & postgre/mysql dependedncy

# PostgreSQL DB
## no uri unlike in mongoBD
use url, user, pwd


## PostgreSQL requires password authentication (SCRAM-based)

SCRAM (Salted Challenge Response Authentication Mechanism):
It's a modern, secure way PostgreSQL uses to verify passwords
Instead of sending the actual password over the network:
Server sends a challenge
Client responds with a hash
More secure than plain password authentication
It's the default in newer PostgreSQL versions


# logging
logging.level.root=ERROR 
    in app.prop
        this reduces amount of shit in op

TRACE  (Most detailed)
DEBUG  (Detailed debugging)
INFO   (Default - General information)
WARN   (Warnings)
ERROR  (Errors)
FATAL  (Critical errors)
OFF    (No logs)


# gpt:
ask ur ai agent to recp/summarise wt uve learned so far just to get a quick overview
