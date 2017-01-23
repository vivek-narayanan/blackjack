CREATE TABLE `users` (
  `id`        int(11) NOT NULL AUTO_INCREMENT,
  `username`  varchar(45) NOT NULL,
  `version`   int(11) DEFAULT '0',
  `balance`   decimal(12,2) NOT NULL,
  `created`   timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modified`  timestamp NULL DEFAULT CURRENT_TIMESTAMP,
              PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

