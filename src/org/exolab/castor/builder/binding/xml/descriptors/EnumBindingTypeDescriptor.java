/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.builder.binding.xml.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.builder.binding.xml.EnumBindingType;

/**
 * 
 * 
 * @version $Revision$ $Date$
 */
public class EnumBindingTypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {

    /**
     * Field _elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field _nsPrefix.
     */
    private String _nsPrefix;

    /**
     * Field _nsURI.
     */
    private String _nsURI;

    /**
     * Field _xmlName.
     */
    private String _xmlName;

    /**
     * Field _identity.
     */
    private org.exolab.castor.xml.XMLFieldDescriptor _identity;

    public EnumBindingTypeDescriptor() {
        super();
        _nsURI = "http://www.castor.org/SourceGenerator/Binding";
        _xmlName = "enumBindingType";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- enumClassName
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.exolab.castor.builder.binding.xml.EnumClassName.class, "enumClassName", "enumClassName", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                EnumBindingType target = (EnumBindingType) object;
                return target.getEnumClassName();
            }
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    EnumBindingType target = (EnumBindingType) object;
                    target.setEnumClassName( (org.exolab.castor.builder.binding.xml.EnumClassName) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public Object newInstance(Object parent) {
                return new org.exolab.castor.builder.binding.xml.EnumClassName();
            }
        };
        desc.setSchemaType("org.exolab.castor.builder.binding.xml.EnumClassName");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.castor.org/SourceGenerator/Binding");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: enumClassName
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- enumMemberList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.exolab.castor.builder.binding.xml.EnumMember.class, "enumMemberList", "enumMember", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                EnumBindingType target = (EnumBindingType) object;
                return target.getEnumMember();
            }
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    EnumBindingType target = (EnumBindingType) object;
                    target.addEnumMember( (org.exolab.castor.builder.binding.xml.EnumMember) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    EnumBindingType target = (EnumBindingType) object;
                    target.removeAllEnumMember();
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public Object newInstance(Object parent) {
                return new org.exolab.castor.builder.binding.xml.EnumMember();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.exolab.castor.builder.binding.xml.EnumMember");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.castor.org/SourceGenerator/Binding");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: enumMemberList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    }

    /**
     * Method getAccessMode.
     * 
     * @return the access mode specified for this class.
     */
    public org.exolab.castor.mapping.AccessMode getAccessMode() {
        return null;
    }

    /**
     * Method getIdentity.
     * 
     * @return the identity field, null if this class has no
     * identity.
     */
    public org.exolab.castor.mapping.FieldDescriptor getIdentity() {
        return _identity;
    }

    /**
     * Method getJavaClass.
     * 
     * @return the Java class represented by this descriptor.
     */
    public Class getJavaClass() {
        return org.exolab.castor.builder.binding.xml.EnumBindingType.class;
    }

    /**
     * Method getNameSpacePrefix.
     * 
     * @return the namespace prefix to use when marshaling as XML.
     */
    public String getNameSpacePrefix() {
        return _nsPrefix;
    }

    /**
     * Method getNameSpaceURI.
     * 
     * @return the namespace URI used when marshaling and
     * unmarshaling as XML.
     */
    public String getNameSpaceURI() {
        return _nsURI;
    }

    /**
     * Method getValidator.
     * 
     * @return a specific validator for the class described by this
     * ClassDescriptor.
     */
    public org.exolab.castor.xml.TypeValidator getValidator() {
        return this;
    }

    /**
     * Method getXMLName.
     * 
     * @return the XML Name for the Class being described.
     */
    public String getXMLName() {
        return _xmlName;
    }

    /**
     * Method isElementDefinition.
     * 
     * @return true if XML schema definition of this Class is that
     * of a global
     * element or element with anonymous type definition.
     */
    public boolean isElementDefinition() {
        return _elementDefinition;
    }

}
