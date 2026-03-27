classDiagram
    class CUSTOMER {
        -String customerID
        -String name
        -String email
        -String phone
    }

    class ORDER {
        -String orderId
        -String orderType
        -double totalAmount
        -double subTotal
    }

    class ORDERITEM {
        -String orderId
        -int quantity
        -double priceAtPurchase
        -String product
    }

    class PRODUCT {
        -String productId
        -String productName
        -String description
        -double currentPrice
    }

    class SHIPMENT {
        -String shipmentId
        -String address
        -String deliveryDate
        -String status
    }

    class CARD {
        -String cardId
        -String cardHolderName
        -String cardNumber
        -String cardType
        -String expiryDate
        -String cvv
    }

    class PAYMENT {
        -String cardId
        -String cardHolderName
        -String cardNumber
        -String cardType
    }

    CUSTOMER "1" -- "0..*" ORDER : places [cite: 3, 4, 5]
    CUSTOMER "1" -- "0..*" CARD : has [cite: 7, 8]
    ORDER "1" *-- "1..*" ORDERITEM : contains [cite: 13, 16, 17]
    ORDER "1" -- "1" SHIPMENT : tracked [cite: 13, 15, 23, 28, 29]
    ORDER "1" -- "1" PAYMENT : paid by [cite: 13, 24, 27, 35]
    ORDERITEM "0..*" -- "1" PRODUCT : links [cite: 18, 20, 21, 22, 36]
    SHIPMENT "1" -- "0..*" PRODUCT : views [cite: 25, 26, 28]
    CARD "1" -- "0..*" PAYMENT : used for [cite: 30, 31, 32]
