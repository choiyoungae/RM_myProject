# DB 생성
DROP DATABASE IF EXISTS RMDB;
CREATE DATABASE RMDB;
USE RMDB;

# 등록업체 테이블 생성(등록업체명, 업체 대표자명, 전화번호)
CREATE TABLE company(
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    companyName CHAR(20) NOT NULL,
    CEOname CHAR(20) NOT NULL,
    contactNum CHAR(20) NOT NULL
);

# 상품정보 테이블 생성(상품명, 금액, 등록일자, 등록업체명)
CREATE TABLE product(
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `name` CHAR(20) NOT NULL,
    price INT(10) NOT NULL,
    regDate DATETIME NOT NULL,
    companyId INT(10) UNSIGNED NOT NULL,
    FOREIGN KEY (companyId) REFERENCES company (id) ON DELETE CASCADE
);

# 구매자 테이블 생성(이름, 연락처)
CREATE TABLE customer(
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `name` CHAR(20) NOT NULL,
    phoneNum CHAR(20) NOT NULL
);

# 구매정보 테이블 생성(상품정보, 구매자, 금액, 구매일자, 구매번호)
CREATE TABLE purchaseInfo(
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    productId INT(10) UNSIGNED NOT NULL,
    customerId INT(10) UNSIGNED NOT NULL,
    productCount INT(10) NOT NULL,
    FOREIGN KEY (productId) REFERENCES product (id),
    FOREIGN KEY (customerId) REFERENCES customer (id)
);

# ===============================================================

SELECT * FROM company;
SELECT * FROM product;
SELECT * FROM customer;
SELECT * FROM purchaseInfo;

# 등록업체 테스트 데이터 생성
INSERT INTO company
SET companyName = '업체1',
CEOname = '대표1',
contactNum = '01012345678';

INSERT INTO company
SET companyName = '업체2',
CEOname = '대표2',
contactNum = '01056781234';

INSERT INTO company
SET companyName = '업체3',
CEOname = '대표3',
contactNum = '01087654321';

# 상품정보 테스트 데이터 생성
INSERT INTO product
SET `name` = '상품1',
price = 15000,
regDate = NOW(),
companyId = 1;

INSERT INTO product
SET `name` = '상품2',
price = 8900,
regDate = NOW(),
companyId = 2;

INSERT INTO product
SET `name` = '상품3',
price = 31000,
regDate = NOW(),
companyId = 3;

# 구매자 테스트 데이터 생성
INSERT INTO customer
SET `name` = '구매자1',
phoneNum = "01011111111";

INSERT INTO customer
SET `name` = '구매자2',
phoneNum = "01022222222";

INSERT INTO customer
SET `name` = '구매자3',
phoneNum = "01033333333";

# 구매정보 테스트 데이터 생성
INSERT INTO purchaseInfo
SET regDate = NOW(),
productId = 3,
customerId = 1,
productCount = 1;

INSERT INTO purchaseInfo
SET regDate = NOW(),
productId = 1,
customerId = 2,
productCount = 2;

INSERT INTO purchaseInfo
SET regDate = NOW(),
productId = 2,
customerId = 3,
productCount = 5;