🚖 JDBC-Based Taxi Booking System – Features
🔌 1. JDBC Integration with MySQL
Uses Java Database Connectivity (JDBC) to connect and interact with a MySQL database.

Performs insertion of booking data into specific transport tables (cab, cabpremium, auto, bike).

🧾 2. Modular Vehicle Booking Options
Supports multiple transport modes:

Cab

Cab Premium

Auto Rickshaw

Bike Ride

Each transport mode has its own individual method and database table for clean separation.

📱 3. User Interaction via Console
Uses Scanner for interactive input from users.

Prompts users to enter:

Pickup location

Drop location

Phone number

Payment

💳 4. Dynamic Fare Generation & Payment Simulation
Randomly generates fare within a fixed range based on vehicle type.

Simulates payment by prompting the user to match the generated fare for successful booking.

🧾 5. Transaction Management
Enables auto-commit off and uses manual commit/rollback to handle payment success or failure.

Ensures data consistency and integrity using JDBC transactions.

🚗 6. Driver & Arrival Simulation
Simulates assignment of a random driver ID and arrival time in minutes.

Enhances realism by providing instant confirmation and ETA after successful booking.

☎️ 7. Phone Number Validation
Validates user phone number input to ensure it's a 10-digit mobile number.

Rejects invalid numbers before proceeding with the database operation.

💾 8. Database Logging
Each successful ride booking is recorded into respective MySQL tables:

cab

cabpremium

auto

bike

🔁 9. Loop-Based Booking Menu
Offers a continuous menu-driven interface until the user chooses to exit.

Users can book multiple rides in one session without restarting the app.

❌ 10. Graceful Exit System
On exit, shows an animated "exiting..." message with a thank-you note.

Ensures user experience is smooth and clear even on termination.
