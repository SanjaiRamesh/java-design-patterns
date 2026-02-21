# 📁 Behavioral Patterns

Focus: Object communication and responsibility.

## 13. Observer – Transaction Status Update
Defines a one-to-many dependency so that when one object changes state, all dependents are notified.

```mermaid
classDiagram
    class Transaction
    class Observer
    class SMSService
    class EmailService

    Transaction --> Observer
    Observer <|.. SMSService
    Observer <|.. EmailService
```

## 14. Strategy – Payment Fee Strategy
Defines a family of algorithms and makes them interchangeable at runtime.

```mermaid
classDiagram
    class FeeStrategy {
        <<interface>>
        +calculateFee()
    }

    class IMPSFee
    class RTGSFee

    FeeStrategy <|.. IMPSFee
    FeeStrategy <|.. RTGSFee
```

## 15. Command – PaymentCommand
Encapsulates a request as an object, allowing parameterization and queuing.

```mermaid
classDiagram
    class Command {
        +execute()
    }

    class PaymentCommand
    class Receiver
```

## 16. Chain of Responsibility – Validation Chain
Passes a request along a chain of handlers until one handles it.

```mermaid
classDiagram
    class Handler
    class KYCHandler
    class LimitHandler
    class FraudHandler

    Handler <|-- KYCHandler
    Handler <|-- LimitHandler
    Handler <|-- FraudHandler
```
## 17. State – PaymentState
Allows an object to change behavior when its internal state changes.

```mermaid
classDiagram
    class PaymentContext
    class PaymentState
    class PendingState
    class CompletedState

    PaymentState <|-- PendingState
    PaymentState <|-- CompletedState
```

## 18. Template Method – Settlement Process
Defines the skeleton of an algorithm, allowing subclasses to override specific steps.

```mermaid
classDiagram
    class SettlementTemplate {
        +process()
        #validate()
        #settle()
    }
```

## 19. Iterator – TransactionIterator
Provides a way to access elements of a collection sequentially without exposing structure.

```mermaid
classDiagram
    class TransactionIterator
    class TransactionCollection
```

## 20. Mediator – PaymentGatewayMediator
Defines an object that encapsulates communication between objects.

```mermaid
classDiagram
    class Mediator
    class BankA
    class BankB

    Mediator <-- BankA
    Mediator <-- BankB
```

## 21. Memento – Rollback Transaction
Captures and restores an object's internal state without exposing details.

```mermaid
classDiagram
    class Transaction
    class TransactionMemento
    class Caretaker
```

## 22. Visitor – Compliance Audit Visitor
Represents an operation to be performed on elements of an object structure.

```mermaid
classDiagram
    class Visitor
    class IMPSPayment
    class RTGSPayment

    Visitor --> IMPSPayment
    Visitor --> RTGSPayment
```

## 23. Interpreter – Payment Rule Engine
Defines a representation for a grammar and an interpreter to evaluate sentences.

```mermaid
classDiagram
    class Expression
    class TerminalExpression
    class NonTerminalExpression
```
