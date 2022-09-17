package com.chb.tags.etl.hfile

import scala.collection.immutable.TreeMap

/**
 * HBase 中各个表的字段名称，存储在TreeMap中
 */
object TableFieldNames{

  // TODO: 使用TreeMap为qualifier做字典序排序

  // a. 行为日志数据表的字段
  val LOG_FIELD_NAMES: TreeMap[String, Int] = TreeMap(
    ("id", 0),
    ("log_id", 1),
    ("remote_ip", 2),
    ("site_global_ticket", 3),
    ("site_global_session", 4),
    ("global_user_id", 5),
    ("cookie_text", 6),
    ("user_agent", 7),
    ("ref_url", 8),
    ("loc_url", 9),
    ("log_time", 10)
  )

  // b. 商品信息数据表的字段
  val GOODS_FIELD_NAMES: TreeMap[String, Int] = TreeMap(
    ("id", 0),
    ("siteid", 1),
    ("istest", 2),
    ("hasread", 3),
    ("supportonedaylimit", 4),
    ("orderid", 5),
    ("cordersn", 6),
    ("isbook", 7),
    ("cpaymentstatus", 8),
    ("cpaytime", 9),
    ("producttype", 10),
    ("productid", 11),
    ("productname", 12),
    ("sku", 13),
    ("price", 14),
    ("number", 15),
    ("lockednumber", 16),
    ("unlockednumber", 17),
    ("productamount", 18),
    ("balanceamount", 19),
    ("couponamount", 20),
    ("esamount", 21),
    ("giftcardnumberid", 22),
    ("usedgiftcardamount", 23),
    ("couponlogid", 24),
    ("activityprice", 25),
    ("activityid", 26),
    ("cateid", 27),
    ("brandid", 28),
    ("netpointid", 29),
    ("shippingfee", 30),
    ("settlementstatus", 31),
    ("receiptorrejecttime", 32),
    ("iswmssku", 33),
    ("scode", 34),
    ("tscode", 35),
    ("tsshippingtime", 36),
    ("status", 37),
    ("productsn", 38),
    ("invoicenumber", 39),
    ("expressname", 40),
    ("invoiceexpressnumber", 41),
    ("postman", 42),
    ("postmanphone", 43),
    ("isnotice", 44),
    ("noticetype", 45),
    ("noticeremark", 46),
    ("noticetime", 47),
    ("shippingtime", 48),
    ("lessordersn", 49),
    ("waitgetlesshippinginfo", 50),
    ("getlesshippingcount", 51),
    ("outping", 52),
    ("lessshiptime", 53),
    ("closetime", 54),
    ("isreceipt", 55),
    ("ismakereceipt", 56),
    ("receiptnum", 57),
    ("receiptaddtime", 58),
    ("makereceipttype", 59),
    ("shippingmode", 60),
    ("lasttimeforshippingmode", 61),
    ("lasteditorforshippingmode", 62),
    ("systemremark", 63),
    ("tongshuaiworkid", 64),
    ("orderpromotionid", 65),
    ("orderpromotionamount", 66),
    ("externalsalesettingid", 67),
    ("recommendationid", 68),
    ("hassendalertnum", 69),
    ("isnolimitstockproduct", 70),
    ("hpregisterdate", 71),
    ("hpfaildate", 72),
    ("hpfinishdate", 73),
    ("hpreservationdate", 74),
    ("shippingopporunity", 75),
    ("istimeoutfree", 76),
    ("itemshareamount", 77),
    ("lessshiptintime", 78),
    ("lessshiptouttime", 79),
    ("cbsseccode", 80),
    ("points", 81),
    ("modified", 82),
    ("splitflag", 83),
    ("splitrelatecordersn", 84),
    ("channelid", 85),
    ("activityid2", 86),
    ("pdorderstatus", 87),
    ("omsordersn", 88),
    ("couponcode", 89),
    ("couponcodevalue", 90),
    ("storeid", 91),
    ("storetype", 92),
    ("stocktype", 93),
    ("o2otype", 94),
    ("brokeragetype", 95),
    ("ogcolor", 96)
  )


  // c. 用户信息数据表的字段
  val USER_FIELD_NAMES: TreeMap[String, Int] = TreeMap(
    ("id", 0),
    ("siteid", 1),
    ("avatarimagefileid", 2),
    ("email", 3),
    ("username", 4),
    ("password", 5),
    ("salt", 6),
    ("registertime", 7),
    ("lastlogintime", 8),
    ("lastloginip", 9),
    ("memberrankid", 10),
    ("bigcustomerid", 11),
    ("lastaddressid", 12),
    ("lastpaymentcode", 13),
    ("gender", 14),
    ("birthday", 15),
    ("qq", 16),
    ("job", 17),
    ("mobile", 18),
    ("politicalface", 19),
    ("nationality", 20),
    ("validatecode", 21),
    ("pwderrcount", 22),
    ("source", 23),
    ("marriage", 24),
    ("money", 25),
    ("moneypwd", 26),
    ("isemailverify", 27),
    ("issmsverify", 28),
    ("smsverifycode", 29),
    ("emailverifycode", 30),
    ("verifysendcoupon", 31),
    ("canreceiveemail", 32),
    ("modified", 33),
    ("channelid", 34),
    ("grade_id", 35),
    ("nick_name", 36),
    ("is_blacklist", 37)
  )

  // d. 订单数据表的字段
  val ORDER_FIELD_NAMES: TreeMap[String, Int] = TreeMap(
    ("id", 0),
    ("siteid", 1),
    ("istest", 2),
    ("hassync", 3),
    ("isbackend", 4),
    ("isbook", 5),
    ("iscod", 6),
    ("notautoconfirm", 7),
    ("ispackage", 8),
    ("packageid", 9),
    ("ordersn", 10),
    ("relationordersn", 11),
    ("memberid", 12),
    ("predictid", 13),
    ("memberemail", 14),
    ("addtime", 15),
    ("synctime", 16),
    ("orderstatus", 17),
    ("paytime", 18),
    ("paymentstatus", 19),
    ("receiptconsignee", 20),
    ("receiptaddress", 21),
    ("receiptzipcode", 22),
    ("receiptmobile", 23),
    ("productamount", 24),
    ("orderamount", 25),
    ("paidbalance", 26),
    ("giftcardamount", 27),
    ("paidamount", 28),
    ("shippingamount", 29),
    ("totalesamount", 30),
    ("usedcustomerbalanceamount", 31),
    ("customerid", 32),
    ("bestshippingtime", 33),
    ("paymentcode", 34),
    ("paybankcode", 35),
    ("paymentname", 36),
    ("consignee", 37),
    ("originregionname", 38),
    ("originaddress", 39),
    ("province", 40),
    ("city", 41),
    ("region", 42),
    ("street", 43),
    ("markbuilding", 44),
    ("poiid", 45),
    ("poiname", 46),
    ("regionname", 47),
    ("address", 48),
    ("zipcode", 49),
    ("mobile", 50),
    ("phone", 51),
    ("receiptinfo", 52),
    ("delayshiptime", 53),
    ("remark", 54),
    ("bankcode", 55),
    ("agent", 56),
    ("confirmtime", 57),
    ("firstconfirmtime", 58),
    ("firstconfirmperson", 59),
    ("finishtime", 60),
    ("tradesn", 61),
    ("signcode", 62),
    ("source", 63),
    ("sourceordersn", 64),
    ("onedaylimit", 65),
    ("logisticsmanner", 66),
    ("aftersalemanner", 67),
    ("personmanner", 68),
    ("visitremark", 69),
    ("visittime", 70),
    ("visitperson", 71),
    ("sellpeople", 72),
    ("sellpeoplemanner", 73),
    ("ordertype", 74),
    ("hasreadtaobaoordercomment", 75),
    ("memberinvoiceid", 76),
    ("taobaogroupid", 77),
    ("tradetype", 78),
    ("steptradestatus", 79),
    ("steppaidfee", 80),
    ("depositamount", 81),
    ("balanceamount", 82),
    ("autocanceldays", 83),
    ("isnolimitstockorder", 84),
    ("ccborderreceivedlogid", 85),
    ("ip", 86),
    ("isgiftcardorder", 87),
    ("giftcarddownloadpassword", 88),
    ("giftcardfindmobile", 89),
    ("autoconfirmnum", 90),
    ("codconfirmperson", 91),
    ("codconfirmtime", 92),
    ("codconfirmremark", 93),
    ("codconfirmstate", 94),
    ("paymentnoticeurl", 95),
    ("addresslon", 96),
    ("addresslat", 97),
    ("smconfirmstatus", 98),
    ("smconfirmtime", 99),
    ("smmanualtime", 100),
    ("smmanualremark", 101),
    ("istogether", 102),
    ("isnotconfirm", 103),
    ("tailpaytime", 104),
    ("points", 105),
    ("modified", 106),
    ("channelid", 107),
    ("isproducedaily", 108),
    ("couponcode", 109),
    ("couponcodevalue", 110),
    ("ckcode", 111)
  )

}