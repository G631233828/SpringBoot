package gjb.validate.pojo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 3.ע��
@Valid �� BindingResult ��һһ��Ӧ�ģ�����ж��@Valid����ôÿ��@Valid������ŵ�BindingResult�������@Valid����֤�����˳������

4.Api
@Null	ֻ����null
@NotNull ����Ϊnull ע�����ڻ�����������Ч������������Ĭ�ϳ�ʼֵ
@AssertFalse ����Ϊfalse
@AssertTrue	������true

�ַ���/����/���ϼ�飺(�ַ���������Ǹ�����)
@Pattern(regexp="reg") ��֤�ַ�����������
@Size(max, min) ��֤�ַ��������顢���ϳ��ȷ�Χ
@NotEmpty ��֤�ַ�����Ϊ�ջ���null
@NotBlank ��֤�ַ�����Ϊnull����trim()��Ϊ��

��ֵ��飺ͬʱ����֤һ���ַ����Ƿ����������Ƶ����ֵ��ַ���
@Max �涨ֵ������int
@Min �涨ֵ������	
@DecimalMax("10.8")	�Դ����ַ�������һ��BigDecimal���涨ֵҪС�����ֵ 
@DecimalMin �����������Ƹ�������С
@Digits(int1, int2) ����һ��С������������С��int1��С�����־���С��int2
@Digits �޲�������֤�ַ����Ƿ�Ϸ�	
@Range(min=long1,max=long2) ��������Ƿ��ڷ�Χ֮��
��Щ�������߽�ֵ

���ڼ�飺Date/Calendar
@Post �޶�һ�����ڣ����ڱ����ǹ�ȥ������
@Future �޶�һ�����ڣ����ڱ�����δ��������

������֤��
@Vaild �ݹ���֤�����ڶ�������ͼ��ϣ���Զ����Ԫ�ء������Ԫ�ؽ���һһУ��
@Email ������֤һ���ַ����Ƿ���һ���Ϸ����Ҽ���ַ�����ַ�����null����֤ͨ��
@URL(protocol=,host=,port=,regexp=,flags=) ����У��һ���ַ����Ƿ��ǺϷ�URL
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@NotNull(message="�û�������Ϊ��")
	private String username;
	@NotNull(message="���벻��Ϊ��")
	private String password;
	private Integer age;
	@Email(message="��������ȷ��email")
	private String email;
}
