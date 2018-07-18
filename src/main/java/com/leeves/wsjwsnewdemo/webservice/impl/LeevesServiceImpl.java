package com.leeves.wsjwsnewdemo.webservice.impl;

import com.leeves.wsjwsnewdemo.webservice.LeevesService;

import javax.jws.WebService;

import lombok.extern.slf4j.Slf4j;

/**
 * Description: web service 实现
 * Package: com.leeves.wsjwsnewdemo.webservice.impl
 * name：wsdl:port，默认是类名
 * targetNamespace: 命名空间,设置为接口的包名倒写(默认是本类包名倒写).如果不写，没有xs:element，
 * endpointInterface：接口的全路径名
 *
 * @author Leeves
 * @version 1.0.0  2018-07-18
 */
@Slf4j
@WebService(targetNamespace = "http://webservice.wsjwsnewdemo.leeves.com/", endpointInterface = "com.leeves.wsjwsnewdemo.webservice.LeevesService")
//@WebService
public class LeevesServiceImpl implements LeevesService {

    @Override
    public String leevesService(String reqMsg) {
        log.info("---jws leevesService reqMsg---:" + reqMsg);
        return "---jws leevesService resMsg---:" + reqMsg;
    }

}