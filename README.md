# Java Design Patterns (GoF)

This repository contains implementations of the 23 Gang of Four (GoF) design patterns in Java.

Patterns are categorized into:
- Creational
- Structural
- Behavioral


🏦 Domain Context Used

- Banking Real-Time-Payment System supporting:

    - IMPS (Instant)
    - NEFT (Batch-based,Low Value)
    - RTGS (High value)
    - Cross-border SWIFT


Each pattern includes:
- Explanation
- UML diagram
- Java implementation
- Real-world example

---

# 📁 Creational Patterns

Focus: Object creation mechanisms.

## 1. Singleton -PaymentConfiguration
Ensures single configuration instance for payment gateway routing.

Diagram:
```mermaid
classDiagram
    class PaymentConfig {
        -static PaymentConfig instance
        -PaymentConfig()
        +getInstance()
    }
```

## 2. Factory Method - PaymentProcessorFactory
Chooses processor based on type (IMPS, NEFT, RTGS).

```mermaid
classDiagram
    class PaymentProcessor {
        <<interface>>
        +process()
    }

    class IMPSProcessor
    class NEFTProcessor
    class RTGSProcessor

    PaymentProcessor <|.. IMPSProcessor
    PaymentProcessor <|.. NEFTProcessor
    PaymentProcessor <|.. RTGSProcessor
```

## 3. Abstract Factory – Domestic vs CrossBorder

```mermaid
classDiagram
    class PaymentFactory {
        <<interface>>
        +createValidator()
        +createProcessor()
    }

    class DomesticFactory
    class CrossBorderFactory

    PaymentFactory <|.. DomesticFactory
    PaymentFactory <|.. CrossBorderFactory
```

## 4. Builder – PaymentRequest Builder

```mermaid
classDiagram
    class PaymentRequest {
        +amount
        +currency
        +beneficiary
    }

    class PaymentBuilder {
        +setAmount()
        +setCurrency()
        +build()
    }

    PaymentBuilder --> PaymentRequest
```

## 5. Prototype – Clone Transaction Template

```mermaid
classDiagram
    class TransactionTemplate {
        +clone()
    }
```

---

# 📁 Structural Patterns

Focus: Composition of classes and objects.

## 6. Adapter – SWIFT Adapter

```mermaid
classDiagram
    class PaymentService {
        +process()
    }

    class SwiftAPI
    class SwiftAdapter

    PaymentService <|.. SwiftAdapter
    SwiftAdapter --> SwiftAPI
```

## 7. Bridge – Payment + Channel
Decouples abstraction from implementation so both can vary independently.
```mermaid
classDiagram
    class Payment {
        +process()
    }

    class Channel {
        <<interface>>
        +send()
    }

    Payment --> Channel
```

Diagram:
Abstraction → Implementor → ConcreteImplementor

## 8. Composite
Composes objects into tree structures to represent part-whole hierarchies.

Diagram:
Component → Leaf / Composite

## 9. Decorator – Fraud Check Layer
Adds new behavior dynamically to an object without modifying its structure.

```mermaid
classDiagram
    class PaymentProcessor
    class FraudCheckDecorator

    PaymentProcessor <|.. FraudCheckDecorator
```

## 10. Facade – PaymentFacade
Provides a simplified interface to a complex subsystem.

```mermaid
classDiagram
    class PaymentFacade
    class Validator
    class Processor
    class Notifier

    PaymentFacade --> Validator
    PaymentFacade --> Processor
    PaymentFacade --> Notifier
```

## 11. Flyweight – Currency Metadata
Reduces memory usage by sharing common object state.

```mermaid
classDiagram
    class CurrencyMetaFactory
    class CurrencyMeta
```

## 12. Proxy – Authorization Proxy
Provides a surrogate or placeholder to control access to another object.

```mermaid
classDiagram
    class PaymentService
    class PaymentProxy

    PaymentService <|.. PaymentProxy
```

---

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

---

# 🎯 Purpose of This Repository

- Strengthen object-oriented design principles
- Demonstrate SOLID principles in action
- Improve architectural thinking
- Prepare for senior backend and system design interviews