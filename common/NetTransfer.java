package common;

import java.io.Serializable;

public class NetTransfer implements Serializable{
	private static final long serialVersionUID = 1L;
	public String action;  // �����������
	public int id;  // �����û������ļ���id
	public String paras;  // �����û��������Ĳ���
	public Object obj;  // ���������ַ�����ʾ��������obj��ʾ

	// ������������Ϣ
	public boolean ifRun;  // �������Ƿ���ȷִ��
	public String strErr;  // ���ִ�д���, ���ش�����Ϣ
	public String strRes;  // ִ����ȷ��ķ�����Ϣ
	public Object objRes;  // ���������ַ�����ʾ��, ��obj��ʾ
}
