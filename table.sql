CREATE TABLE `test`.`t_sb_pro` (
	`id` varchar(50) DEFAULT NULL,
	`pro_name` varchar(50) DEFAULT NULL,
	`pro_code` varchar(50) DEFAULT NULL,
	`created_time` datetime DEFAULT NULL,
	`last_modified_time` datetime DEFAULT NULL
) ENGINE=`InnoDB` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ROW_FORMAT=COMPACT COMMENT='' CHECKSUM=0 DELAY_KEY_WRITE=0;

CREATE TABLE `test`.`t_sb_user` (
	`login_name` varchar(32),
	`real_name` varchar(32),
	`pass_word` varchar(16)
) COMMENT='';