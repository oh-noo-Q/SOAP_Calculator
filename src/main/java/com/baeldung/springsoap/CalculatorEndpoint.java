package com.baeldung.springsoap;

import com.baeldung.springsoap.gen.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculatorEndpoint {

    private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

    public static CalculatorService cal = new CalculatorService();

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "calculatorRequest")

    @ResponsePayload
    public CalculatorResponse calculator(@RequestPayload CalculatorRequest request) {
        CalculatorResponse response = new CalculatorResponse();
        response.setResult(cal.calculate(request.getNum1(),request.getNum2(),request.getOperator()));
        return response;
    }
}