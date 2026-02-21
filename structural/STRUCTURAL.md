
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
