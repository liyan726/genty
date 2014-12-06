package com.genty.others;


import org.codehaus.jackson.map.ObjectMapper;

import com.genty.model.User;


public class Jsonutil {
	
	private static ObjectMapper mapper; 
    
    /**
     * ��ȡObjectMapperʵ��
     * @param createNew ��ʽ��true����ʵ����false,���ڵ�mapperʵ��
     * @return
     */ 
    public static synchronized ObjectMapper getMapperInstance(boolean createNew) {    
        if (createNew) {    
            return new ObjectMapper();    
        } else if (mapper == null) {    
            mapper = new ObjectMapper();    
        }    
        return mapper;    
    }  
       
    /**
     * ��java����ת����json�ַ���
     * @param obj ׼��ת���Ķ���
     * @return json�ַ���
     * @throws Exception 
     */ 
    public static String beanToJson(Object obj) throws Exception { 
        try { 
            ObjectMapper objectMapper = getMapperInstance(false); 
            String json =objectMapper.writeValueAsString(obj); 
            return json; 
        } catch (Exception e) { 
            throw new Exception(e.getMessage()); 
        }        
    } 
       
    /**
     * ��java����ת����json�ַ���
     * @param obj ׼��ת���Ķ���
     * @param createNew ObjectMapperʵ����ʽ:true����ʵ��;false,���ڵ�mapperʵ��
     * @return json�ַ���
     * @throws Exception
     */ 
    public static String beanToJson(Object obj,Boolean createNew) throws Exception { 
        try { 
            ObjectMapper objectMapper = getMapperInstance(createNew); 
            String json =objectMapper.writeValueAsString(obj); 
            return json; 
        } catch (Exception e) { 
            throw new Exception(e.getMessage()); 
        }        
    } 
       
    /**
     * ��json�ַ���ת����java����
     * @param json ׼��ת����json�ַ���
     * @param cls  ׼��ת������
     * @return 
     * @throws Exception 
     */ 
    public static Object jsonToBean(String json, Class<?> cls) throws Exception { 
        try { 
        ObjectMapper objectMapper = getMapperInstance(false); 
        Object vo = objectMapper.readValue(json, cls); 
        return vo; 
        } catch (Exception e) { 
            throw new Exception(e.getMessage()); 
        }    
    } 
       
    /**
     * ��json�ַ���ת����java����
     * @param json ׼��ת����json�ַ���
     * @param cls  ׼��ת������
     * @param createNew ObjectMapperʵ����ʽ:true����ʵ��;false,���ڵ�mapperʵ��
     * @return
     * @throws Exception
     */ 
    public static Object jsonToBean(String json, Class<?> cls,Boolean createNew) throws Exception { 
        try { 
        ObjectMapper objectMapper = getMapperInstance(createNew); 
        Object vo = objectMapper.readValue(json, cls); 
        return vo; 
        } catch (Exception e) { 
            throw new Exception(e.getMessage()); 
        }    
    } 
	
	public static void main(String[] args) throws Exception {
		User u = new User();
		u.setName("ds");
		u.setId(1);
		
		String re=beanToJson(u);
		System.out.println(re);
	}
}
