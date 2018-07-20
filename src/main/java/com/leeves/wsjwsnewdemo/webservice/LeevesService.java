package com.leeves.wsjwsnewdemo.webservice;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Description: web service 接口
 * Package: com.leeves.wsjwsnewdemo.webservice
 *
 * @author Leeves
 * @version 1.0.0  2018-07-18
 */
@WebService
public interface LeevesService {

    @WebMethod
    String leevesService(String reqMsg);
}