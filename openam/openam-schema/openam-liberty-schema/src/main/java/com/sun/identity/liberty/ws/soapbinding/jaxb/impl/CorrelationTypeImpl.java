//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.soapbinding.jaxb.impl;

public class CorrelationTypeImpl implements com.sun.identity.liberty.ws.soapbinding.jaxb.CorrelationType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.xml.bind.marshaller.IdentifiableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected boolean has_MustUnderstand;
    protected boolean _MustUnderstand;
    protected java.lang.String _Actor;
    protected java.lang.String _MessageID;
    protected java.lang.String _Id;
    protected java.lang.String _RefToMessageID;
    protected java.util.Calendar _Timestamp;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.soapbinding.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.soapbinding.jaxb.CorrelationType.class);
    }

    public boolean isMustUnderstand() {
        return _MustUnderstand;
    }

    public void setMustUnderstand(boolean value) {
        _MustUnderstand = value;
        has_MustUnderstand = true;
    }

    public java.lang.String getActor() {
        return _Actor;
    }

    public void setActor(java.lang.String value) {
        _Actor = value;
    }

    public java.lang.String getMessageID() {
        return _MessageID;
    }

    public void setMessageID(java.lang.String value) {
        _MessageID = value;
    }

    public java.lang.String getId() {
        return _Id;
    }

    public void setId(java.lang.String value) {
        _Id = value;
    }

    public java.lang.String getRefToMessageID() {
        return _RefToMessageID;
    }

    public void setRefToMessageID(java.lang.String value) {
        _RefToMessageID = value;
    }

    public java.util.Calendar getTimestamp() {
        return _Timestamp;
    }

    public void setTimestamp(java.util.Calendar value) {
        _Timestamp = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.soapbinding.jaxb.impl.CorrelationTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Id!= null) {
            context.startAttribute("", "id");
            try {
                context.text(context.onID(this, ((java.lang.String) _Id)), "Id");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        context.startAttribute("", "messageID");
        try {
            context.text(((java.lang.String) _MessageID), "MessageID");
        } catch (java.lang.Exception e) {
            com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        if (_RefToMessageID!= null) {
            context.startAttribute("", "refToMessageID");
            try {
                context.text(((java.lang.String) _RefToMessageID), "RefToMessageID");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        context.startAttribute("", "timestamp");
        try {
            context.text(com.sun.msv.datatype.xsd.DateTimeType.theInstance.serializeJavaObject(((java.util.Calendar) _Timestamp), null), "Timestamp");
        } catch (java.lang.Exception e) {
            com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        if (_Actor!= null) {
            context.startAttribute("http://schemas.xmlsoap.org/soap/envelope/", "actor");
            try {
                context.text(((java.lang.String) _Actor), "Actor");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (has_MustUnderstand) {
            context.startAttribute("http://schemas.xmlsoap.org/soap/envelope/", "mustUnderstand");
            try {
                context.text(javax.xml.bind.DatatypeConverter.printBoolean(((boolean) _MustUnderstand)), "MustUnderstand");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Actor!= null) {
            context.getNamespaceContext().declareNamespace("http://schemas.xmlsoap.org/soap/envelope/", null, true);
        }
        if (has_MustUnderstand) {
            context.getNamespaceContext().declareNamespace("http://schemas.xmlsoap.org/soap/envelope/", null, true);
        }
    }

    public java.lang.String ____jaxb____getId() {
        return ((java.lang.String) _Id);
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.soapbinding.jaxb.CorrelationType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom."
+"sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000 com.sun.msv."
+"grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClasst\u0000\u001fLco"
+"m/sun/msv/grammar/NameClass;xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5"
+"\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003"
+"L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004name"
+"t\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\u001fcom.sun.msv.data"
+"type.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.Ncnam"
+"eType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\ris"
+"AlwaysValidxr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnam"
+"espaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u001cL\u0000\nwhiteSpacet"
+"\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://"
+"www.w3.org/2001/XMLSchemat\u0000\u0002IDsr\u00005com.sun.msv.datatype.xsd.W"
+"hiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.dataty"
+"pe.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0000sr\u00000com.sun.msv.gram"
+"mar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0010psr\u0000\u001bc"
+"om.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001cL\u0000\fnam"
+"espaceURIq\u0000~\u0000\u001cxpq\u0000~\u0000 q\u0000~\u0000\u001fsr\u0000#com.sun.msv.grammar.SimpleName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001cL\u0000\fnamespaceURIq\u0000~\u0000\u001cxr\u0000\u001dcom"
+".sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0002idt\u0000\u0000sr\u00000com.sun.m"
+"sv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~"
+"\u0000\u000f\u0001q\u0000~\u0000.sq\u0000~\u0000\fppsq\u0000~\u0000\u0011ppsr\u0000\'com.sun.msv.datatype.xsd.FinalCo"
+"mponent\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\nfinalValuexr\u0000\u001ecom.sun.msv.datatype.xsd."
+"Proxy\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDa"
+"tatypeImpl;xq\u0000~\u0000\u001bt\u0000\u0016urn:liberty:sb:2003-08t\u0000\u0006IDTypesr\u00005com.s"
+"un.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000\"sq\u0000~\u0000\u0018q\u0000~\u0000\u001ft\u0000\u0006stringq\u0000~\u00009\u0001\u0000\u0000\u0000\u0000q\u0000~\u0000%sq\u0000~\u0000&q\u0000~\u0000;q\u0000~\u00006sq\u0000~"
+"\u0000(t\u0000\tmessageIDq\u0000~\u0000,sq\u0000~\u0000\nppsq\u0000~\u0000\fq\u0000~\u0000\u0010pq\u0000~\u00001sq\u0000~\u0000(t\u0000\u000erefToMe"
+"ssageIDq\u0000~\u0000,q\u0000~\u0000.sq\u0000~\u0000\fppsq\u0000~\u0000\u0011ppsr\u0000%com.sun.msv.datatype.xs"
+"d.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatype.xsd.DateTi"
+"meBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000\u0019q\u0000~\u0000\u001ft\u0000\bdateTimeq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&q"
+"\u0000~\u0000Hq\u0000~\u0000\u001fsq\u0000~\u0000(t\u0000\ttimestampq\u0000~\u0000,sq\u0000~\u0000\nppsq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\u0011q\u0000"
+"~\u0000\u0010psr\u0000#com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0019"
+"q\u0000~\u0000\u001ft\u0000\u0006anyURIq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&q\u0000~\u0000Qq\u0000~\u0000\u001fsq\u0000~\u0000(t\u0000\u0005actort\u0000)htt"
+"p://schemas.xmlsoap.org/soap/envelope/q\u0000~\u0000.sq\u0000~\u0000\nppsq\u0000~\u0000\fq\u0000~"
+"\u0000\u0010psq\u0000~\u0000\u0011ppsr\u0000%com.sun.msv.datatype.xsd.PatternFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0001[\u0000\bpatternst\u0000\u0013[Ljava/lang/String;xr\u0000;com.sun.msv.datatype"
+".xsd.DataTypeWithLexicalConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xr\u0000*com.su"
+"n.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFix"
+"edZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypeq\u0000~\u00004L\u0000\fconcreteTypet\u0000\'Lco"
+"m/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000\u001cxq\u0000~\u0000\u001bq"
+"\u0000~\u0000Upq\u0000~\u0000#\u0000\u0000sr\u0000$com.sun.msv.datatype.xsd.BooleanType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0019q\u0000~\u0000\u001ft\u0000\u0007booleanq\u0000~\u0000#q\u0000~\u0000`t\u0000\u0007patternur\u0000\u0013[Ljava.lang."
+"String;\u00ad\u00d2V\u00e7\u00e9\u001d{G\u0002\u0000\u0000xp\u0000\u0000\u0000\u0001t\u0000\u00030|1q\u0000~\u0000%sq\u0000~\u0000&t\u0000\u000fboolean-derivedq"
+"\u0000~\u0000Usq\u0000~\u0000(t\u0000\u000emustUnderstandq\u0000~\u0000Uq\u0000~\u0000.sr\u0000\"com.sun.msv.grammar"
+".ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar"
+"/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Express"
+"ionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006pare"
+"ntt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\t\u0001pq\u0000~\u0000\u000bq\u0000~\u0000Lq"
+"\u0000~\u0000\bq\u0000~\u0000\u0007q\u0000~\u0000\u0005q\u0000~\u0000\tq\u0000~\u0000\u0006q\u0000~\u0000Vq\u0000~\u0000?x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "-------------------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.soapbinding.jaxb.impl.CorrelationTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        attIdx = context.getAttribute("", "messageID");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  9 :
                        attIdx = context.getAttribute("", "timestamp");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 12;
                            eatText2(v);
                            continue outer;
                        }
                        break;
                    case  12 :
                        attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "actor");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 15;
                            eatText3(v);
                            continue outer;
                        }
                        state = 15;
                        continue outer;
                    case  18 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  6 :
                        attIdx = context.getAttribute("", "refToMessageID");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText4(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  15 :
                        attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "mustUnderstand");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 18;
                            eatText5(v);
                            continue outer;
                        }
                        state = 18;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText6(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _MessageID = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Timestamp = ((java.util.Calendar) com.sun.msv.datatype.xsd.DateTimeType.theInstance.createJavaObject(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value), null));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Actor = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _RefToMessageID = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText5(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _MustUnderstand = javax.xml.bind.DatatypeConverter.parseBoolean(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_MustUnderstand = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText6(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Id = context.addToIdTable(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        attIdx = context.getAttribute("", "messageID");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  9 :
                        attIdx = context.getAttribute("", "timestamp");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 12;
                            eatText2(v);
                            continue outer;
                        }
                        break;
                    case  12 :
                        attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "actor");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 15;
                            eatText3(v);
                            continue outer;
                        }
                        state = 15;
                        continue outer;
                    case  18 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        attIdx = context.getAttribute("", "refToMessageID");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText4(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  15 :
                        attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "mustUnderstand");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 18;
                            eatText5(v);
                            continue outer;
                        }
                        state = 18;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText6(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        if (("messageID" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        break;
                    case  9 :
                        if (("timestamp" == ___local)&&("" == ___uri)) {
                            state = 10;
                            return ;
                        }
                        break;
                    case  12 :
                        if (("actor" == ___local)&&("http://schemas.xmlsoap.org/soap/envelope/" == ___uri)) {
                            state = 13;
                            return ;
                        }
                        state = 15;
                        continue outer;
                    case  18 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        if (("refToMessageID" == ___local)&&("" == ___uri)) {
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
                    case  15 :
                        if (("mustUnderstand" == ___local)&&("http://schemas.xmlsoap.org/soap/envelope/" == ___uri)) {
                            state = 16;
                            return ;
                        }
                        state = 18;
                        continue outer;
                    case  0 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        attIdx = context.getAttribute("", "messageID");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  9 :
                        attIdx = context.getAttribute("", "timestamp");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 12;
                            eatText2(v);
                            continue outer;
                        }
                        break;
                    case  12 :
                        attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "actor");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 15;
                            eatText3(v);
                            continue outer;
                        }
                        state = 15;
                        continue outer;
                    case  11 :
                        if (("timestamp" == ___local)&&("" == ___uri)) {
                            state = 12;
                            return ;
                        }
                        break;
                    case  18 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("", "refToMessageID");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText4(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  5 :
                        if (("messageID" == ___local)&&("" == ___uri)) {
                            state = 6;
                            return ;
                        }
                        break;
                    case  17 :
                        if (("mustUnderstand" == ___local)&&("http://schemas.xmlsoap.org/soap/envelope/" == ___uri)) {
                            state = 18;
                            return ;
                        }
                        break;
                    case  15 :
                        attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "mustUnderstand");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 18;
                            eatText5(v);
                            continue outer;
                        }
                        state = 18;
                        continue outer;
                    case  14 :
                        if (("actor" == ___local)&&("http://schemas.xmlsoap.org/soap/envelope/" == ___uri)) {
                            state = 15;
                            return ;
                        }
                        break;
                    case  8 :
                        if (("refToMessageID" == ___local)&&("" == ___uri)) {
                            state = 9;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText6(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  1 :
                            state = 2;
                            eatText6(value);
                            return ;
                        case  3 :
                            attIdx = context.getAttribute("", "messageID");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 6;
                                eatText1(v);
                                continue outer;
                            }
                            break;
                        case  4 :
                            state = 5;
                            eatText1(value);
                            return ;
                        case  9 :
                            attIdx = context.getAttribute("", "timestamp");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 12;
                                eatText2(v);
                                continue outer;
                            }
                            break;
                        case  12 :
                            attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "actor");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 15;
                                eatText3(v);
                                continue outer;
                            }
                            state = 15;
                            continue outer;
                        case  7 :
                            state = 8;
                            eatText4(value);
                            return ;
                        case  18 :
                            revertToParentFromText(value);
                            return ;
                        case  13 :
                            state = 14;
                            eatText3(value);
                            return ;
                        case  16 :
                            state = 17;
                            eatText5(value);
                            return ;
                        case  6 :
                            attIdx = context.getAttribute("", "refToMessageID");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 9;
                                eatText4(v);
                                continue outer;
                            }
                            state = 9;
                            continue outer;
                        case  10 :
                            state = 11;
                            eatText2(value);
                            return ;
                        case  15 :
                            attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "mustUnderstand");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 18;
                                eatText5(v);
                                continue outer;
                            }
                            state = 18;
                            continue outer;
                        case  0 :
                            attIdx = context.getAttribute("", "id");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText6(v);
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
