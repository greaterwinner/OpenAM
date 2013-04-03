/**
 *
 ~ DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 ~
 ~ Copyright (c) 2011-2013 ForgeRock US. All Rights Reserved
 ~
 ~ The contents of this file are subject to the terms
 ~ of the Common Development and Distribution License
 ~ (the License). You may not use this file except in
 ~ compliance with the License.
 ~
 ~ You can obtain a copy of the License at
 ~ http://forgerock.org/license/CDDLv1.0.html
 ~ See the License for the specific language governing
 ~ permission and limitations under the License.
 ~
 ~ When distributing Covered Code, include this CDDL
 ~ Header Notice in each file and include the License file
 ~ at http://forgerock.org/license/CDDLv1.0.html
 ~ If applicable, add the following below the CDDL Header,
 ~ with the fields enclosed by brackets [] replaced by
 ~ your own identifying information:
 ~ "Portions Copyrighted [year] [name of copyright owner]"
 *
 */
package org.forgerock.openam.xacml.v3.Functions;

import org.forgerock.openam.xacml.v3.model.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * A.3.10 Bag functions
 These functions operate on a bag of ‘type’ values, where type is one of the primitive data-types,
 and x.x is a version of XACML where the function has been defined.
 Some additional conditions defined for each function below SHALL cause the expression to evaluate to "Indeterminate".

 urn:oasis:names:tc:xacml:x.x:function:type-is-in
 This function SHALL take an argument of ‘type’ as the first argument and a bag of ‘type’ values as the second argument
 and SHALL return an “http://www.w3.org/2001/XMLSchema#boolean”.
 The function SHALL evaluate to "True" if and only if the first argument matches by the
 "urn:oasis:names:tc:xacml:x.x:function:type-equal" any value in the bag.  Otherwise, it SHALL return “False”.

 */

/**
 * XACML Bag Functions
 * <p/>
 * Testing Functions as specified by OASIS XACML v3 Core specification.
 *
 * @author Jeff.Schenk@ForgeRock.com
 */
public class TestXacmlBagFunctionsGroup4 {

    static final FunctionArgument trueObject = new DataValue(DataType.XACMLBOOLEAN, "true");
    static final FunctionArgument falseObject = new DataValue(DataType.XACMLBOOLEAN, "false");


    @BeforeClass
    public void before() throws Exception {
    }

    @AfterClass
    public void after() throws Exception {
    }


    /**
     * Is In Methods
     *  urn:oasis:names:tc:xacml:x.x:function:type-is-in
     This function SHALL take an argument of ‘type’ as the first argument and a bag of ‘type’ values as the second argument
     and SHALL return an “http://www.w3.org/2001/XMLSchema#boolean”.
     The function SHALL evaluate to "True" if and only if the first argument matches by the
     "urn:oasis:names:tc:xacml:x.x:function:type-equal" any value in the bag.  Otherwise, it SHALL return “False”.

     urn:oasis:names:tc:xacml:1.0:function:string-is-in
     urn:oasis:names:tc:xacml:1.0:function:boolean-is-in
     urn:oasis:names:tc:xacml:1.0:function:integer-is-in
     urn:oasis:names:tc:xacml:1.0:function:double-is-in
     urn:oasis:names:tc:xacml:1.0:function:time-is-in
     urn:oasis:names:tc:xacml:1.0:function:date-is-in
     urn:oasis:names:tc:xacml:1.0:function:dateTime-is-in
     urn:oasis:names:tc:xacml:1.0:function:anyURI-is-in
     urn:oasis:names:tc:xacml:1.0:function:hexBinary-is-in
     urn:oasis:names:tc:xacml:1.0:function:base64Binary-is-in
     urn:oasis:names:tc:xacml:3.0:function:dayTimeDuration-is-in
     urn:oasis:names:tc:xacml:3.0:function:yearMonthDuration-is-in
     urn:oasis:names:tc:xacml:1.0:function:x500Name-is-in
     urn:oasis:names:tc:xacml:1.0:function:rfc822Name-is-in


     */

    /**
     * urn:oasis:names:tc:xacml:1.0:function:anyURI-is-in
     */
    @Test
    public void test_AnyuriIsIn() throws XACML3EntitlementException {
        // TODO :: Finish...
    }

    /**
     *  urn:oasis:names:tc:xacml:1.0:function:base64Binary-is-in
     */
    @Test
    public void test_Base64BinaryIsIn() throws XACML3EntitlementException {
        // TODO :: Finish...
    }

    /**
     * urn:oasis:names:tc:xacml:1.0:function:boolean-is-in
     */
    @Test
    public void test_BooleanIsIn() throws XACML3EntitlementException {
        // TODO :: Finish...
    }

    /**
     *  urn:oasis:names:tc:xacml:1.0:function:date-is-in
     */
    @Test
    public void test_DateIsIn() throws XACML3EntitlementException {
        // TODO :: Finish...
    }

    /**
     * urn:oasis:names:tc:xacml:1.0:function:dateTime-is-in
     */
    @Test
    public void test_DatetimeIsIn() throws XACML3EntitlementException {
        // TODO :: Finish...
    }

    /**
     * urn:oasis:names:tc:xacml:3.0:function:dayTimeDuration-is-in
     */
    @Test
    public void test_DaytimedurationIsIn() throws XACML3EntitlementException {
        // TODO :: Finish...
    }

    /**
     *  urn:oasis:names:tc:xacml:1.0:function:double-is-in
     */
    @Test
    public void test_DoubleIsIn() throws XACML3EntitlementException {
        // TODO :: Finish...
    }

    /**
     *  urn:oasis:names:tc:xacml:1.0:function:hexBinary-is-in
     */
    @Test
    public void test_HexbinaryIsIn() throws XACML3EntitlementException {
        // TODO :: Finish...
    }

    /**
     * urn:oasis:names:tc:xacml:1.0:function:integer-is-in
     */
    @Test
    public void test_IntegerIsIn() throws XACML3EntitlementException {
        // TODO :: Finish...
    }

    /**
     *  urn:oasis:names:tc:xacml:1.0:function:rfc822Name-is-in
     */
    @Test
    public void test_Rfc822NameIsIn() throws XACML3EntitlementException {
        // TODO :: Finish...
    }

    /**
     *  urn:oasis:names:tc:xacml:1.0:function:string-is-in
     */
    @Test
    public void test_StringIsIn() throws XACML3EntitlementException {
        final DataValue HELLO_WORLD = new DataValue(DataType.XACMLSTRING, "HELLO WORLD!");
        final DataValue HELLO_WORLD_FORGEROCK = new DataValue(DataType.XACMLSTRING, "HELLO WORLD From ForgeRock!");
        final DataValue HELLO_WORLD_DIFFERENT = new DataValue(DataType.XACMLSTRING, "HELLO WORLD");

        // Establish a Bag with Several Elements.
        StringBag stringBag = new StringBag();
        stringBag.addArgument(HELLO_WORLD);
        stringBag.addArgument(HELLO_WORLD_FORGEROCK);
        DataBag dataBag = (DataBag) stringBag.evaluate(null);
        assertNotNull(dataBag);

        StringIsIn isIn = new StringIsIn();
        isIn.addArgument(HELLO_WORLD);
        isIn.addArgument(dataBag);
        FunctionArgument result = isIn.evaluate(null);
        assertTrue(result.isTrue());

        // Establish a new Bag with Several Elements.
        stringBag = new StringBag();
        stringBag.addArgument(HELLO_WORLD);
        stringBag.addArgument(HELLO_WORLD_FORGEROCK);
        dataBag = (DataBag) stringBag.evaluate(null);
        assertNotNull(dataBag);

        isIn = new StringIsIn();
        isIn.addArgument(HELLO_WORLD_DIFFERENT);
        isIn.addArgument(dataBag);
        result = isIn.evaluate(null);
        assertTrue(result.isFalse());

    }

    /**
     * urn:oasis:names:tc:xacml:1.0:function:time-is-in
     */
    @Test
    public void test_TimeIsIn() throws XACML3EntitlementException {
        // TODO :: Finish...
    }

    /**
     * urn:oasis:names:tc:xacml:1.0:function:x500Name-is-in
     */
    @Test
    public void test_X500NameIsIn() throws XACML3EntitlementException {
        // TODO :: Finish...
    }

    /**
     *  urn:oasis:names:tc:xacml:3.0:function:yearMonthDuration-is-in
     */
    @Test
    public void test_YearmonthdurationIsIn() throws XACML3EntitlementException {
        // TODO :: Finish...
    }

}
