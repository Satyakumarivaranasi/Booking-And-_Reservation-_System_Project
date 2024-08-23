use bookingandreservationsystem;
CREATE TABLE User (
    UserID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255),
    Email VARCHAR(255),
    Phone VARCHAR(20)
);
CREATE TABLE Service (
    ServiceID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255),
    Description TEXT,
    Price DECIMAL(10, 2)
);
CREATE TABLE Booking (
    BookingID INT PRIMARY KEY AUTO_INCREMENT,
    UserID INT,
    ServiceID INT,
    Date DATE,
    Status VARCHAR(50),
    FOREIGN KEY (UserID) REFERENCES User(UserID),
    FOREIGN KEY (ServiceID) REFERENCES Service(ServiceID)
);
CREATE TABLE Location (
    LocationID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255),
    Address VARCHAR(255),
    City VARCHAR(100),
    Country VARCHAR(100)
);
CREATE TABLE Review (
    ReviewID INT PRIMARY KEY AUTO_INCREMENT,
    UserID INT,
    ServiceID INT,
    Rating INT,
    Comment TEXT,
    FOREIGN KEY (UserID) REFERENCES User(UserID),
    FOREIGN KEY (ServiceID) REFERENCES Service(ServiceID)
);
CREATE TABLE Payments (
    PaymentID INT PRIMARY KEY AUTO_INCREMENT,
    BookingID INT,
    Amount DECIMAL(10, 2),
    PaymentDate DATE,
    PaymentMethod VARCHAR(100),
    FOREIGN KEY (BookingID) REFERENCES Booking(BookingID)
);
CREATE TABLE CancellationRefunds (
    CancellationRefundID INT PRIMARY KEY AUTO_INCREMENT,
    BookingID INT,
    CancellationDate DATE,
    RefundAmount DECIMAL(10, 2),
    FOREIGN KEY (BookingID) REFERENCES Booking(BookingID)
);
