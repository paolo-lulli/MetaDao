package net.lulli.metadao.api;


public class MetaDto extends net.lulli.metadao.api.Dto implements Cloneable
{
    String tableName;
    String idField;
    String recordType;
    boolean chronology = false;

    public static MetaDto getNewInstance(String tableNameParameter)
    {
        MetaDto newInstance = new MetaDto();
        newInstance.setTableName(tableNameParameter);
        return newInstance;
    }

    /*
     * Accepts key, value as strings
     * Used by Scala extensions
     */
    public void put(String key, String value)
    {
        super.put(key, value);
    }

    /* (non-Javadoc)
     * @see net.lulli.metadao.model.IMetaDto#getTableName()
     */
    public String getTableName()
    {
        return tableName;
    }

    /* (non-Javadoc)
     * @see net.lulli.metadao.model.IMetaDto#setTableName(java.lang.String)
     */
    public void setTableName(String tableName)
    {
        this.tableName = tableName;
    }

    /* (non-Javadoc)
     * @see net.lulli.metadao.model.IMetaDto#getRecordType()
     */
    public String getRecordType()
    {
        return recordType;
    }

    /* (non-Javadoc)
     * @see net.lulli.metadao.model.IMetaDto#setRecordType(java.lang.String)
     */
    public void setRecordType(String recordType)
    {
        this.recordType = recordType;
    }
    /* (non-Javadoc)
	 * @see net.lulli.metadao.model.IMetaDto#getIdField()
	 */

    public Object clone()
    {
        try
        {
            return super.clone();
        } catch (Exception e)
        {
            return null;
        }
    }
}
