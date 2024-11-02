# Price Calculator App

A Spring Boot and React-based web application for calculating product prices based on quantity. This app allows users to view price listings for two products ("Penguin-ears" and "Horseshoe") for quantities ranging from 1 to 50 units. It also includes a price calculator for custom quantities, with discounts for bulk orders.

## Features

- Lists prices for products from 1 to 50 units
- Calculates optimal pricing for custom quantities
- Applies a 10% discount for orders of 3 or more cartons
- Built using Spring Boot (Backend) and React (Frontend)
- Test-driven development with JUnit

## Technologies Used

- **Backend**: Spring Boot, Spring Data JPA, H2 Database
- **Frontend**: React, Axios
- **Database**: H2 (for development/testing)
- **Testing**: JUnit 5
- **Build Tool**: Gradle

## Getting Started

### Prerequisites

- Java 21
- Node.js and npm
- Gradle

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/price-calculator.git
   cd price-calculator



Frontend Setup:

Navigate to the frontend directory (usually src/main/frontend if it's placed there).
Install dependencies and start the React app:
bash
Copy code
npm install
npm start
The frontend app will start on http://localhost:3000.
Usage
View Product Prices:

Navigate to http://localhost:3000 to view the price list for each product for quantities from 1 to 50.
Calculate Price:

Use the calculator form to select a product and enter a custom quantity.
Click Calculate Price to see the total cost, including any applicable discounts.
API Endpoints
GET /products: Retrieves the list of available products
POST /products/calculate: Calculates the total price based on product and quantity
Example POST request body:

json
Copy code
{
  "productName": "Penguin-ears",
  "quantity": 25
}
Testing
To run tests, use the following command:

bash
Copy code
./gradlew test
The tests are written using JUnit 5 and follow test-driven development principles. They cover various pricing scenarios, such as single units, full cartons, multiple cartons with discounts, and cartons plus extra units.

Sample Data
The following products are pre-configured in the application:

Product	Units per Carton	Carton Price	Single Unit Price
Penguin-ears	20	175.0	11.38
Horseshoe	5	825.0	214.5
Project Structure
plaintext
Copy code
price-calculator/
├── src/
│   ├── main/
│   │   ├── java/com/example/pricecalculator/    # Backend application
│   │   ├── resources/                           # Application properties and H2 database config
│   └── test/                                    # Test classes
├── src/components/                              # React components
├── build.gradle                                 # Gradle build file
└── README.md                                    # Project readme file
License
This project is licensed under the MIT License - see the LICENSE file for details.