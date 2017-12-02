/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : easybuy

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2017-11-30 14:47:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for easybuy_announcement
-- ----------------------------
DROP TABLE IF EXISTS `easybuy_announcement`;
CREATE TABLE `easybuy_announcement` (
  `EA_ID` int(11) NOT NULL,
  `EA_TITLE` varchar(1000) DEFAULT NULL,
  `EA_CONTENT` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`EA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of easybuy_announcement
-- ----------------------------
INSERT INTO `easybuy_announcement` VALUES ('1', 'nginx在windows上的安装', '写一下简单的安装方法\r\n1.下载软件\r\n需要的软件有nginx,php,mysql(如不需要可不安装)\r\nnginx.org,www.php.net上面有得下\r\n全部解压出来\r\nphp基本不用做任何修改（下载直接解压版本的');
INSERT INTO `easybuy_announcement` VALUES ('2', 'Mybatis分页插件-PageHelper的使用', '先，在spring-mybatis.xml中是这样配置:');

-- ----------------------------
-- Table structure for easybuy_comment
-- ----------------------------
DROP TABLE IF EXISTS `easybuy_comment`;
CREATE TABLE `easybuy_comment` (
  `EC_ID` int(10) NOT NULL COMMENT '留言ID',
  `EC_CONTENT` varchar(200) NOT NULL COMMENT '留言内容',
  `EC_CREATE_TIME` date NOT NULL COMMENT '留言创建时间',
  `EC_REPLY` varchar(200) DEFAULT NULL COMMENT '回复内容',
  `EC_REPLY_TIME` date DEFAULT NULL COMMENT '回复时间',
  `EC_NICK_NAME` varchar(10) NOT NULL COMMENT '留言人昵称',
  PRIMARY KEY (`EC_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of easybuy_comment
-- ----------------------------
INSERT INTO `easybuy_comment` VALUES ('655', '刚订了台IPod，很是期待啊', '2017-12-12', '货已发出，请注意收货时开箱检查货物是否有问题', '2017-12-12', '小乖');
INSERT INTO `easybuy_comment` VALUES ('680', '佳能D50现在可以多长时间发货呢', '2017-12-12', '一般在订单确认后的第3天发货', '2017-12-12', '无极');

-- ----------------------------
-- Table structure for easybuy_image
-- ----------------------------
DROP TABLE IF EXISTS `easybuy_image`;
CREATE TABLE `easybuy_image` (
  `EI_PID` int(11) NOT NULL,
  `EI_PICTURE` varchar(1000) DEFAULT NULL,
  `EI_USERID` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`EI_PID`),
  KEY `FK_PID_UID` (`EI_USERID`),
  CONSTRAINT `FK_PID_UID` FOREIGN KEY (`EI_USERID`) REFERENCES `easybuy_user` (`EU_USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of easybuy_image
-- ----------------------------

-- ----------------------------
-- Table structure for easybuy_news
-- ----------------------------
DROP TABLE IF EXISTS `easybuy_news`;
CREATE TABLE `easybuy_news` (
  `EN_ID` int(30) NOT NULL,
  `EN_TITLE` varchar(40) NOT NULL COMMENT '新闻标题',
  `EN_CONTENT` varchar(1000) NOT NULL COMMENT '新闻内容',
  `EN_CREATE_TIME` date NOT NULL COMMENT '新闻创建时间',
  PRIMARY KEY (`EN_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of easybuy_news
-- ----------------------------
INSERT INTO `easybuy_news` VALUES ('597', '迎双旦促销大酬宾我', '迎双旦促销大酬宾我', '2017-12-12');
INSERT INTO `easybuy_news` VALUES ('649', '加入会员，赢千万大礼包', '加入会员，赢千万大礼包', '2017-12-12');
INSERT INTO `easybuy_news` VALUES ('650', '新年不夜天，通宵也是开张了', '新年不夜天，通宵也是开张了', '2017-12-12');
INSERT INTO `easybuy_news` VALUES ('653', '团购阿迪1折起', '团购阿迪1折起', '2017-12-12');
INSERT INTO `easybuy_news` VALUES ('654', '配货通知', '配货通知', '2017-12-12');
INSERT INTO `easybuy_news` VALUES ('5085', '搜索', 'ee', '2017-11-28');
INSERT INTO `easybuy_news` VALUES ('14421', 'dd', 'dd', '2017-11-28');

-- ----------------------------
-- Table structure for easybuy_order
-- ----------------------------
DROP TABLE IF EXISTS `easybuy_order`;
CREATE TABLE `easybuy_order` (
  `EO_ID` int(10) NOT NULL,
  `EO_USER_ID` varchar(10) NOT NULL COMMENT '用户ID',
  `EO_USER_NAME` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `EO_USER_ADDRESS` varchar(200) DEFAULT NULL COMMENT '用户地址',
  `EO_CREATE_TIME` date NOT NULL COMMENT '订单产生时间',
  `EO_COST` double NOT NULL COMMENT '总价钱',
  `EO_STATUS` int(6) NOT NULL COMMENT '订单状态',
  `EO_TYPE` int(6) NOT NULL COMMENT '付款类型',
  PRIMARY KEY (`EO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of easybuy_order
-- ----------------------------
INSERT INTO `easybuy_order` VALUES ('1234', 'rr', '王五', '江苏南京', '2017-11-06', '1200', '3', '2');
INSERT INTO `easybuy_order` VALUES ('1245', 'dd', '为', '安徽淮北', '2017-11-05', '1290', '4', '3');

-- ----------------------------
-- Table structure for easybuy_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `easybuy_order_detail`;
CREATE TABLE `easybuy_order_detail` (
  `EOD_ID` int(10) NOT NULL,
  `EO_ID` int(10) NOT NULL COMMENT '订单ID',
  `EP_ID` int(10) NOT NULL COMMENT '商品ID',
  `EOD_QUANTITY` int(6) NOT NULL COMMENT '购买数量',
  `EOD_COST` double NOT NULL COMMENT '此商品的总价钱',
  PRIMARY KEY (`EOD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of easybuy_order_detail
-- ----------------------------
INSERT INTO `easybuy_order_detail` VALUES ('748', '747', '592', '1', '200');
INSERT INTO `easybuy_order_detail` VALUES ('749', '747', '643', '2', '600');

-- ----------------------------
-- Table structure for easybuy_permission
-- ----------------------------
DROP TABLE IF EXISTS `easybuy_permission`;
CREATE TABLE `easybuy_permission` (
  `EP_PID` varchar(50) NOT NULL,
  `EP_PNAME` varchar(50) DEFAULT NULL,
  `EP_URL` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`EP_PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of easybuy_permission
-- ----------------------------
INSERT INTO `easybuy_permission` VALUES ('5', 'high', 'aaa');
INSERT INTO `easybuy_permission` VALUES ('6', 'middle', 'bbb');
INSERT INTO `easybuy_permission` VALUES ('7', 'low', 'ccc');

-- ----------------------------
-- Table structure for easybuy_per_role
-- ----------------------------
DROP TABLE IF EXISTS `easybuy_per_role`;
CREATE TABLE `easybuy_per_role` (
  `EPR_RID` varchar(50) NOT NULL,
  `EPR_PID` varchar(50) NOT NULL,
  KEY `p_rid` (`EPR_RID`),
  KEY `p_pid` (`EPR_PID`),
  CONSTRAINT `p_pid` FOREIGN KEY (`EPR_PID`) REFERENCES `easybuy_permission` (`EP_PID`),
  CONSTRAINT `p_rid` FOREIGN KEY (`EPR_RID`) REFERENCES `easybuy_role` (`ER_ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of easybuy_per_role
-- ----------------------------
INSERT INTO `easybuy_per_role` VALUES ('1', '5');
INSERT INTO `easybuy_per_role` VALUES ('2', '6');
INSERT INTO `easybuy_per_role` VALUES ('3', '7');

-- ----------------------------
-- Table structure for easybuy_product
-- ----------------------------
DROP TABLE IF EXISTS `easybuy_product`;
CREATE TABLE `easybuy_product` (
  `EP_ID` int(10) NOT NULL,
  `EP_NAME` varchar(20) NOT NULL COMMENT '商品名称',
  `EP_DESCRIPTION` varchar(100) DEFAULT NULL COMMENT '商品描述',
  `EP_PRICE` double NOT NULL COMMENT '商品单价',
  `EP_STOCK` int(10) NOT NULL COMMENT '商品库存',
  `EPC_ID` int(10) DEFAULT NULL COMMENT '商品分类父ID',
  `EPC_CHILD_ID` int(10) DEFAULT NULL COMMENT '商品分类子ID',
  `EP_FILE_NAME` varchar(200) DEFAULT NULL COMMENT '商品图片名称',
  PRIMARY KEY (`EP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of easybuy_product
-- ----------------------------
INSERT INTO `easybuy_product` VALUES ('123', '利仁2018M福满堂电饼铛 好用实惠', '高清', '1200', '12', '12', '1', '7.jpg');
INSERT INTO `easybuy_product` VALUES ('456', '新西兰原产原装进口奶粉', '脱脂奶粉', '64', '12', '11', '1', '10.jpg');
INSERT INTO `easybuy_product` VALUES ('593', '爱国者MP4 全屏触摸多格式播放 4G', '女士专用', '300', '29998', '542', null, '0.jpg');
INSERT INTO `easybuy_product` VALUES ('601', '法国德菲丝松露精品巧克力500g/盒', '三元', '20', '199', '545', null, '1.jpg');
INSERT INTO `easybuy_product` VALUES ('639', '乐扣普通型保鲜盒圣诞7件套', '旅行包', '2', '12', null, null, '2.jpg');
INSERT INTO `easybuy_product` VALUES ('643', '欧珀莱均衡保湿四件套', '饰品', '300', '2996', '545', '548', '3.jpg');
INSERT INTO `easybuy_product` VALUES ('645', '联想笔记本电脑 高速独立显存', '电脑', '50', '500', '545', '548', '4.jpg');
INSERT INTO `easybuy_product` VALUES ('660', '法姿韩版显瘦彩边时尚牛仔铅笔裤', '三星', '20', '2000', '545', '628', '5.jpg');
INSERT INTO `easybuy_product` VALUES ('2341', '韩版潮行李箱拉杆箱', '登机箱', '158', '11', '1', '1', '8.jpg');
INSERT INTO `easybuy_product` VALUES ('13387', 'Genius925纯银施华洛世奇水晶吊坠', '1', '12', '1', '548', null, '6.jpg');
INSERT INTO `easybuy_product` VALUES ('34533', '眼镜框韩版潮复古眼镜', '眼镜', '69', '11', '1', '1', '12.jpg');
INSERT INTO `easybuy_product` VALUES ('1111111', '爱意润丝现代简约沙发组合', '沙发', '6199', '1', '1', '1', '11.jpg');

-- ----------------------------
-- Table structure for easybuy_product_category
-- ----------------------------
DROP TABLE IF EXISTS `easybuy_product_category`;
CREATE TABLE `easybuy_product_category` (
  `EPC_ID` int(10) NOT NULL DEFAULT '0' COMMENT '商品分类ID',
  `EPC_NAME` varchar(20) DEFAULT NULL COMMENT '商品分类名称',
  `EPC_PARENT_ID` int(10) DEFAULT NULL COMMENT '商品分类父ID',
  PRIMARY KEY (`EPC_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of easybuy_product_category
-- ----------------------------
INSERT INTO `easybuy_product_category` VALUES ('1', '电器', '0');
INSERT INTO `easybuy_product_category` VALUES ('2', '衣服', '0');
INSERT INTO `easybuy_product_category` VALUES ('546', '洗衣机', '1');
INSERT INTO `easybuy_product_category` VALUES ('548', '冰箱', '1');
INSERT INTO `easybuy_product_category` VALUES ('626', '女装', '2');
INSERT INTO `easybuy_product_category` VALUES ('6299', '小天鹅洗衣机', '1');
INSERT INTO `easybuy_product_category` VALUES ('6950', '空调', '1');
INSERT INTO `easybuy_product_category` VALUES ('9362', '影视', '0');
INSERT INTO `easybuy_product_category` VALUES ('12901', 'q', '1');
INSERT INTO `easybuy_product_category` VALUES ('12925', '男鞋', '19647');
INSERT INTO `easybuy_product_category` VALUES ('13116', '连衣裙', '2');
INSERT INTO `easybuy_product_category` VALUES ('16589', '电子书', '0');
INSERT INTO `easybuy_product_category` VALUES ('19647', '鞋子', '0');

-- ----------------------------
-- Table structure for easybuy_role
-- ----------------------------
DROP TABLE IF EXISTS `easybuy_role`;
CREATE TABLE `easybuy_role` (
  `ER_ROLE_ID` varchar(40) NOT NULL,
  `ER_ROLE_NAME` varchar(50) DEFAULT NULL,
  `ER_ROLE_ACK` int(11) DEFAULT NULL,
  `ER_ROLE_CREATER` bigint(20) DEFAULT NULL,
  `ER_ROLE_CREATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ER_ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of easybuy_role
-- ----------------------------
INSERT INTO `easybuy_role` VALUES ('1', 'manager', '2', '3', '2017-11-14 09:49:46');
INSERT INTO `easybuy_role` VALUES ('2', 'clerk', '2', '2', '2017-11-07 18:29:43');
INSERT INTO `easybuy_role` VALUES ('3', 'ceo', '3', '3', '2017-11-01 18:30:09');

-- ----------------------------
-- Table structure for easybuy_role_user
-- ----------------------------
DROP TABLE IF EXISTS `easybuy_role_user`;
CREATE TABLE `easybuy_role_user` (
  `uid` varchar(50) NOT NULL,
  `rid` varchar(50) NOT NULL,
  KEY `uid` (`uid`),
  KEY `rid` (`rid`),
  CONSTRAINT `rid` FOREIGN KEY (`rid`) REFERENCES `easybuy_role` (`ER_ROLE_ID`),
  CONSTRAINT `uid` FOREIGN KEY (`uid`) REFERENCES `easybuy_user` (`EU_USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of easybuy_role_user
-- ----------------------------
INSERT INTO `easybuy_role_user` VALUES ('1', '1');
INSERT INTO `easybuy_role_user` VALUES ('2', '2');
INSERT INTO `easybuy_role_user` VALUES ('3', '3');

-- ----------------------------
-- Table structure for easybuy_user
-- ----------------------------
DROP TABLE IF EXISTS `easybuy_user`;
CREATE TABLE `easybuy_user` (
  `EU_USER_ID` varchar(100) NOT NULL DEFAULT '0',
  `EU_USER_NAME` varchar(40) NOT NULL COMMENT '用户名',
  `EU_PASSWORD` varchar(20) NOT NULL COMMENT '密码',
  `EU_SEX` varchar(1) NOT NULL COMMENT '性别',
  `EU_BIRTHDAY` date DEFAULT NULL COMMENT '生日',
  `EU_IDENTITY_CODE` varchar(60) DEFAULT NULL COMMENT '身份证号',
  `EU_EMAIL` varchar(80) DEFAULT NULL COMMENT 'email',
  `EU_MOBILE` varchar(11) DEFAULT NULL COMMENT '电话',
  `EU_ADDRESS` varchar(200) DEFAULT NULL COMMENT '地址',
  `EU_STATUS` int(6) NOT NULL COMMENT '用户权限状态 1普通用户  2管理员 3 游客',
  `EU_DELETE_STATUS` int(11) DEFAULT NULL COMMENT '用户删除后状态 -1 禁止登录 0 正常用户',
  PRIMARY KEY (`EU_USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of easybuy_user
-- ----------------------------
INSERT INTO `easybuy_user` VALUES ('0', 'wu', '123', '男', null, null, '123@123.com', '123', 'qq', '1', '0');
INSERT INTO `easybuy_user` VALUES ('1', 'JQ', 'q', '男', '2017-11-19', null, 'jq@126.com', '222222222', '北京市海淀区成府路207号', '1', '0');
INSERT INTO `easybuy_user` VALUES ('2', '普通用户', 'ss', '男', '2017-11-06', null, 'pu@126.com', '333333333', '北京市海淀区成府路207号', '1', '0');
INSERT INTO `easybuy_user` VALUES ('20171129105', 'dd', 'dd', '男', null, null, 'd', 'd', 'd', '1', '0');
INSERT INTO `easybuy_user` VALUES ('20171129304', 'd', 'd', '男', null, null, 'dd', 'dd', 'd', '1', '0');
INSERT INTO `easybuy_user` VALUES ('20171129510', 'zhangwu', '123', '男', null, null, 'zhangwu@127.com', '123456', '11', '1', '0');
INSERT INTO `easybuy_user` VALUES ('20171129581', 'tt', 'r', '男', null, null, 'r144', 'r', 'r', '1', '0');
INSERT INTO `easybuy_user` VALUES ('3', 'admin', 'a', '男', '2017-11-14', null, 'ad@126.com', '333', '北京市海淀区成府路', '1', '0');
INSERT INTO `easybuy_user` VALUES ('484', '潘琪', '11', '女', null, null, '123@126.com', '111', '11', '1', '0');
