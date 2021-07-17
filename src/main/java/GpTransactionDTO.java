import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.ZonedDateTime;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

//@NoArgsConstructor
//@RequiredArgsConstructor
@JsonInclude(Include.NON_NULL)
public class GpTransactionDTO {

    private static final String DEFAULT_TIMEZONE = "UTC";
    @JsonProperty("transaction_id")
    private String transactionId;
    @JsonProperty("business_time")
    @JsonFormat(
        shape = Shape.STRING,
        pattern = "yyyy-MM-dd HH:mm:ss",
        timezone = "UTC"
    )
    private ZonedDateTime businessTime;
    @JsonProperty("valid_date")
    @JsonFormat(
        shape = Shape.STRING,
        pattern = "yyyy-MM-dd HH:mm:ss",
        timezone = "UTC"
    )
    private ZonedDateTime validDate;
    @JsonProperty("expiry_date")
    @JsonFormat(
        shape = Shape.STRING,
        pattern = "yyyy-MM-dd HH:mm:ss",
        timezone = "UTC"
    )
    private ZonedDateTime expiryDate;
    @JsonProperty("order_code")
    private String orderCode;
    @JsonProperty("action_code")
    private String actionCode;
    @JsonProperty("action_type")
    private String actionType;
    @JsonProperty("from_wallet_address")
    private String fromWalletAddress;
    @JsonProperty("to_wallet_address")
    private String toWalletAddress;
    @JsonProperty("user_address")
    private String userAddress;
    @JsonProperty("cathay_point_amount")
    private Long cathayPointAmount;
    @JsonProperty("partner_point_amount")
    private Long partnerPointAmount;
    @JsonProperty("created_time")
    @JsonFormat(
        shape = Shape.STRING,
        pattern = "yyyy-MM-dd HH:mm:ss",
        timezone = "UTC"
    )
    private ZonedDateTime createdTime;
    @JsonProperty("updated_time")
    @JsonFormat(
        shape = Shape.STRING,
        pattern = "yyyy-MM-dd HH:mm:ss",
        timezone = "UTC"
    )
    private ZonedDateTime updatedTime;
    @JsonProperty("base_unit")
    private int baseUnit;
    @JsonProperty("from_wallet_is_cp_entity")
    private int fromWalletIsCpEntity;
    @JsonProperty("from_wallet_point_name")
    private String fromWalletPointName;
    @JsonProperty("from_wallet_erp_id")
    private String fromWalletErpId;
    @JsonProperty("to_wallet_is_cpentity")
    private int toWalletIsCpEntity;
    @JsonProperty("to_wallet_point_name")
    private String toWalletPointName;
    @JsonProperty("to_wallet_erp_id")
    private String toWalletErpId;
    @JsonProperty("is_points_with_pay")
    private int isPointsWithPay;
    @JsonProperty("binding_tx_id")
    private String bindingTxId;
    @JsonProperty("record_id")
    private String recordId;
    @JsonProperty("action_name")
    private String actionName;
    @JsonProperty("detail_tx_grant_id")
    private String detailTxGrantId;
    @JsonProperty("detail_from_wallet_address")
    private String detailFromWalletAddress;
    @JsonProperty("detail_create_time")
    @JsonFormat(
        shape = Shape.STRING,
        pattern = "yyyy-MM-dd HH:mm:ss",
        timezone = "UTC"
    )
    private ZonedDateTime detailCreateTime;
    @JsonProperty("detail_order_code")
    private String detailOrderCode;
    @JsonProperty("detail_action_type")
    private String detailActionType;
    @JsonProperty("detail_action_code")
    private String detailActionCode;
    @JsonProperty("detail_amount")
    private Long detailAmount;
    @JsonProperty("detail_original_tx_grant_id")
    private String detailOriginalTxGrantId;
    @JsonProperty("detail_is_cp_entity")
    private int detailIsCpEntity;
    @JsonProperty("detail_point_name")
    private String detailPointName;
    @JsonProperty("detail_erp_id")
    private String detailErpId;
    @JsonProperty("detail_is_points_with_pay")
    private int detailIsPointsWithPay;
    @JsonProperty("detail_binding_tx_id")
    private String detailBindingTxId;
    @JsonProperty("detail_record_id")
    private String detailRecordId;
    @JsonProperty("detail_to_wallet_address")
    private String detailToWalletAddress;
    @JsonProperty("detail_used_time")
    @JsonFormat(
        shape = Shape.STRING,
        pattern = "yyyy-MM-dd HH:mm:ss",
        timezone = "UTC"
    )
    private ZonedDateTime detailUsedTime;

    public String toString() {
      return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

    public String getTransactionId() {
      return this.transactionId;
    }

    public ZonedDateTime getBusinessTime() {
      return this.businessTime;
    }

    public ZonedDateTime getValidDate() {
      return this.validDate;
    }

    public ZonedDateTime getExpiryDate() {
      return this.expiryDate;
    }

    public String getOrderCode() {
      return this.orderCode;
    }

    public String getActionCode() {
      return this.actionCode;
    }

    public String getActionType() {
      return this.actionType;
    }

    public String getFromWalletAddress() {
      return this.fromWalletAddress;
    }

    public String getToWalletAddress() {
      return this.toWalletAddress;
    }

    public String getUserAddress() {
      return this.userAddress;
    }

    public Long getCathayPointAmount() {
      return this.cathayPointAmount;
    }

    public Long getPartnerPointAmount() {
      return this.partnerPointAmount;
    }

    public ZonedDateTime getCreatedTime() {
      return this.createdTime;
    }

    public ZonedDateTime getUpdatedTime() {
      return this.updatedTime;
    }

    public int getBaseUnit() {
      return this.baseUnit;
    }

    public int getFromWalletIsCpEntity() {
      return this.fromWalletIsCpEntity;
    }

    public String getFromWalletPointName() {
      return this.fromWalletPointName;
    }

    public String getFromWalletErpId() {
      return this.fromWalletErpId;
    }

    public int getToWalletIsCpEntity() {
      return this.toWalletIsCpEntity;
    }

    public String getToWalletPointName() {
      return this.toWalletPointName;
    }

    public String getToWalletErpId() {
      return this.toWalletErpId;
    }

    public int getIsPointsWithPay() {
      return this.isPointsWithPay;
    }

    public String getBindingTxId() {
      return this.bindingTxId;
    }

    public String getRecordId() {
      return this.recordId;
    }

    public String getActionName() {
      return this.actionName;
    }

    public String getDetailTxGrantId() {
      return this.detailTxGrantId;
    }

    public String getDetailFromWalletAddress() {
      return this.detailFromWalletAddress;
    }

    public ZonedDateTime getDetailCreateTime() {
      return this.detailCreateTime;
    }

    public String getDetailOrderCode() {
      return this.detailOrderCode;
    }

    public String getDetailActionType() {
      return this.detailActionType;
    }

    public String getDetailActionCode() {
      return this.detailActionCode;
    }

    public Long getDetailAmount() {
      return this.detailAmount;
    }

    public String getDetailOriginalTxGrantId() {
      return this.detailOriginalTxGrantId;
    }

    public int getDetailIsCpEntity() {
      return this.detailIsCpEntity;
    }

    public String getDetailPointName() {
      return this.detailPointName;
    }

    public String getDetailErpId() {
      return this.detailErpId;
    }

    public int getDetailIsPointsWithPay() {
      return this.detailIsPointsWithPay;
    }

    public String getDetailBindingTxId() {
      return this.detailBindingTxId;
    }

    public String getDetailRecordId() {
      return this.detailRecordId;
    }

    public String getDetailToWalletAddress() {
      return this.detailToWalletAddress;
    }

    public ZonedDateTime getDetailUsedTime() {
      return this.detailUsedTime;
    }

    public void setTransactionId(String transactionId) {
      this.transactionId = transactionId;
    }

    public void setBusinessTime(ZonedDateTime businessTime) {
      this.businessTime = businessTime;
    }

    public void setValidDate(ZonedDateTime validDate) {
      this.validDate = validDate;
    }

    public void setExpiryDate(ZonedDateTime expiryDate) {
      this.expiryDate = expiryDate;
    }

    public void setOrderCode(String orderCode) {
      this.orderCode = orderCode;
    }

    public void setActionCode(String actionCode) {
      this.actionCode = actionCode;
    }

    public void setActionType(String actionType) {
      this.actionType = actionType;
    }

    public void setFromWalletAddress(String fromWalletAddress) {
      this.fromWalletAddress = fromWalletAddress;
    }

    public void setToWalletAddress(String toWalletAddress) {
      this.toWalletAddress = toWalletAddress;
    }

    public void setUserAddress(String userAddress) {
      this.userAddress = userAddress;
    }

    public void setCathayPointAmount(Long cathayPointAmount) {
      this.cathayPointAmount = cathayPointAmount;
    }

    public void setPartnerPointAmount(Long partnerPointAmount) {
      this.partnerPointAmount = partnerPointAmount;
    }

    public void setCreatedTime(ZonedDateTime createdTime) {
      this.createdTime = createdTime;
    }

    public void setUpdatedTime(ZonedDateTime updatedTime) {
      this.updatedTime = updatedTime;
    }

    public void setBaseUnit(int baseUnit) {
      this.baseUnit = baseUnit;
    }

    public void setFromWalletIsCpEntity(int fromWalletIsCpEntity) {
      this.fromWalletIsCpEntity = fromWalletIsCpEntity;
    }

    public void setFromWalletPointName(String fromWalletPointName) {
      this.fromWalletPointName = fromWalletPointName;
    }

    public void setFromWalletErpId(String fromWalletErpId) {
      this.fromWalletErpId = fromWalletErpId;
    }

    public void setToWalletIsCpEntity(int toWalletIsCpEntity) {
      this.toWalletIsCpEntity = toWalletIsCpEntity;
    }

    public void setToWalletPointName(String toWalletPointName) {
      this.toWalletPointName = toWalletPointName;
    }

    public void setToWalletErpId(String toWalletErpId) {
      this.toWalletErpId = toWalletErpId;
    }

    public void setIsPointsWithPay(int isPointsWithPay) {
      this.isPointsWithPay = isPointsWithPay;
    }

    public void setBindingTxId(String bindingTxId) {
      this.bindingTxId = bindingTxId;
    }

    public void setRecordId(String recordId) {
      this.recordId = recordId;
    }

    public void setActionName(String actionName) {
      this.actionName = actionName;
    }

    public void setDetailTxGrantId(String detailTxGrantId) {
      this.detailTxGrantId = detailTxGrantId;
    }

    public void setDetailFromWalletAddress(String detailFromWalletAddress) {
      this.detailFromWalletAddress = detailFromWalletAddress;
    }

    public void setDetailCreateTime(ZonedDateTime detailCreateTime) {
      this.detailCreateTime = detailCreateTime;
    }

    public void setDetailOrderCode(String detailOrderCode) {
      this.detailOrderCode = detailOrderCode;
    }

    public void setDetailActionType(String detailActionType) {
      this.detailActionType = detailActionType;
    }

    public void setDetailActionCode(String detailActionCode) {
      this.detailActionCode = detailActionCode;
    }

    public void setDetailAmount(Long detailAmount) {
      this.detailAmount = detailAmount;
    }

    public void setDetailOriginalTxGrantId(String detailOriginalTxGrantId) {
      this.detailOriginalTxGrantId = detailOriginalTxGrantId;
    }

    public void setDetailIsCpEntity(int detailIsCpEntity) {
      this.detailIsCpEntity = detailIsCpEntity;
    }

    public void setDetailPointName(String detailPointName) {
      this.detailPointName = detailPointName;
    }

    public void setDetailErpId(String detailErpId) {
      this.detailErpId = detailErpId;
    }

    public void setDetailIsPointsWithPay(int detailIsPointsWithPay) {
      this.detailIsPointsWithPay = detailIsPointsWithPay;
    }

    public void setDetailBindingTxId(String detailBindingTxId) {
      this.detailBindingTxId = detailBindingTxId;
    }

    public void setDetailRecordId(String detailRecordId) {
      this.detailRecordId = detailRecordId;
    }

    public void setDetailToWalletAddress(String detailToWalletAddress) {
      this.detailToWalletAddress = detailToWalletAddress;
    }

    public void setDetailUsedTime(ZonedDateTime detailUsedTime) {
      this.detailUsedTime = detailUsedTime;
    }

    public GpTransactionDTO() {
    }

    public boolean equals(Object o) {
      if (o == this) {
        return true;
      } else if (!(o instanceof GpTransactionDTO)) {
        return false;
      } else {
        GpTransactionDTO other = (GpTransactionDTO)o;
        if (!other.canEqual(this)) {
          return false;
        } else {
          Object this$transactionId = this.getTransactionId();
          Object other$transactionId = other.getTransactionId();
          if (this$transactionId == null) {
            if (other$transactionId != null) {
              return false;
            }
          } else if (!this$transactionId.equals(other$transactionId)) {
            return false;
          }

          return true;
        }
      }
    }

    protected boolean canEqual(Object other) {
      return other instanceof GpTransactionDTO;
    }

//    public int hashCode() {
//      int PRIME = true;
//      int result = 1;
//      Object $transactionId = this.getTransactionId();
//      int result = result * 59 + ($transactionId == null ? 43 : $transactionId.hashCode());
//      return result;
//    }
//  }


}
