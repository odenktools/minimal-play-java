package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import utils.TimeHelper;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SampleRequest {

    public SampleRequest(){}

	@JsonProperty("client_id")
	public String clientId;

	@JsonProperty("trx_id")
	public String trxId;

	@JsonProperty("trx_amount")
	public String trxAmount;

	@JsonProperty("customer_name")
	public String customerName;

	@JsonProperty("customer_email")
	public String customerEmail;

	@JsonProperty("customer_phone")
	public String customerPhone;

	@JsonProperty("virtual_account")
	public String virtualAccount;

	@JsonProperty("datetime_expired")
	public String datetimeExpired = TimeHelper.timeExpiredGenerator();

	public String description;
}