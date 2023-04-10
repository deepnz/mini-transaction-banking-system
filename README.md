# mini-transaction-banking-system

// Code PR In-Progress

This is an app trying to recreate a banking system with the below entities
- `Account` represents a bank account, which has an account number, a balance, and a list of transactions. It provides methods to deposit, withdraw, transfer, send money, get transactions, and get a statement for a given date range.
- `Transaction` represents a transaction that occurred on an account, which has a type (e.g., deposit, withdrawal), an amount, and a date.
- `User` represents a bank user, which has a name, an email address, and a list of accounts. It provides methods to add an account and get the list of accounts.
- `BankingApp` is the main class of the app, which creates a user, adds three accounts to the user, performs some transactions on the accounts, and prints out the account information, transactions, and statement for the user.
