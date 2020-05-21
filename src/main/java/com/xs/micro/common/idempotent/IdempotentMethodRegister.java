package com.xs.micro.common.idempotent;

import java.util.HashSet;
import java.util.Set;

/**
 * 幂等方法注册
 * @author tanyuanpeng
 * @Date 2019/5/13 10:53
 **/
public class IdempotentMethodRegister {


    private final static Set<String> idempotentMethodCollections = new HashSet<String>(16);

    private final static String SEPARATOR = ".";

    private IdempotentMethodRegister() {}

    static {
        idempotentMethodCollections.add("com.xs.micro.biz.core.domain.business.account.impl.AssureAccountOperationBusinessImpl.plusAvailable");
        idempotentMethodCollections.add("com.xs.micro.member.domain.service.impl.PointServiceImpl.earnPoint");
        idempotentMethodCollections.add("com.xs.micro.member.domain.service.impl.PointServiceImpl.earnPointWithCalculate");
        idempotentMethodCollections.add("com.xs.micro.coupon.domain.business.sendcoupon.SendCouponBusiness.sendCoupon");
        idempotentMethodCollections.add("com.xs.micro.coupon.domain.business.sendcoupon.SendCouponBusiness.sendCouponBatch");
        idempotentMethodCollections.add("com.xs.micro.member.domain.business.SendMsgBusiness.sendMemberPointMessage");
        idempotentMethodCollections.add("com.xs.micro.member.domain.service.impl.PointServiceImpl.addPoint");
        idempotentMethodCollections.add("com.xs.micro.biz.core.domain.business.account.impl.RepayAccountBusinessImpl.repayLocalBatch");
        idempotentMethodCollections.add("com.xs.micro.member.domain.business.point.PointBusiness.usePoint");
        idempotentMethodCollections.add("com.xs.micro.repay.domain.business.assets.impl.ActOrderAccountNotifyHandleBusinessImpl.actOrderRepayAccountAndNotifyHandle");
        idempotentMethodCollections.add("com.xs.micro.member.domain.business.PointTransferBusiness.confirmTransferPointAccount");
        idempotentMethodCollections.add("com.xs.micro.member.domain.business.PointTransferBusiness.cancelTransferPointAccount");
        idempotentMethodCollections.add("com.xs.micro.member.domain.business.PointTransferBusiness.tryTransferPointAccount");
        idempotentMethodCollections.add("com.xs.micro.member.domain.service.impl.UserDailyOperationStatusServiceImpl.addPuzzleCount");
        idempotentMethodCollections.add("com.xs.micro.member.domain.service.impl.SignInServiceImpl.signIn");
        idempotentMethodCollections.add("com.xs.micro.member.domain.service.impl.ShakeServiceImpl.createUserShake");
        idempotentMethodCollections.add("com.xs.micro.member.domain.service.impl.ShakeServiceImpl.updateDailyShakeStatus");
        idempotentMethodCollections.add("com.xs.micro.member.domain.business.CouponBusiness.issueLifeCoupon");
        idempotentMethodCollections.add("com.xs.micro.coupon.domain.business.sendcoupon.CrmApiBusiness.sendAutCouponToUserSimple");
        idempotentMethodCollections.add("com.xs.micro.biz.core.domain.business.account.action.AssureRepayBusiness.repay");
        idempotentMethodCollections.add("com.xs.micro.biz.core.domain.business.account.action.BorrowRepayBusiness.repay");
        idempotentMethodCollections.add("com.xs.micro.biz.core.domain.business.account.action.AssureRepayProcessBusiness.assureRepayHandle");
        idempotentMethodCollections.add("com.xs.micro.expand.domain.business.BrokerCustomerBusiness.updateInvalidTimeById");
        idempotentMethodCollections.add("com.xs.micro.member.domain.business.CouponBusiness.confirmLifeCouponConvert");
        idempotentMethodCollections.add("com.xs.micro.member.domain.business.CouponBusiness.cancelLifeCouponConvert");
        idempotentMethodCollections.add("com.xs.micro.member.domain.business.ExperienceBusiness.recommendAward");
        idempotentMethodCollections.add("com.xs.micro.member.domain.business.activity.PetUsePointBusiness.tryPetUsePointAccount");
        idempotentMethodCollections.add("com.xs.micro.member.domain.business.activity.PetUsePointBusiness.confirmPetUsePointAccount");
        idempotentMethodCollections.add("com.xs.micro.member.domain.business.activity.PetUsePointBusiness.cancelPetUsePointAccount");
        idempotentMethodCollections.add("com.crs.project.xs.share.business.UserShareBusiness.saveUserOrder");
        idempotentMethodCollections.add("com.xs.micro.biz.core.domain.business.assets.impl.AssetLoanBusinessImpl.loanFinishAssetHandle");
        idempotentMethodCollections.add("com.xs.micro.member.domain.business.ExperienceBusiness.usePointGetAddExp");
        idempotentMethodCollections.add("com.xs.micro.member.domain.business.ExperienceBusiness.usePointGetAddExp");
        idempotentMethodCollections.add("com.xs.micro.bookingorder.domain.business.PurchaseOrderBusiness.bankCallback");
        idempotentMethodCollections.add("com.xs.micro.biz.core.domain.business.account.impl.UserAccountOperationBusinessImpl.addUsable");
        idempotentMethodCollections.add("com.xs.micro.biz.core.domain.business.account.impl.UserAccountOperationBusinessImpl.withDrawSuccess");
        idempotentMethodCollections.add("com.xs.micro.biz.core.domain.business.account.impl.BorrowerAccountOperationBusinessImpl.charge");
        idempotentMethodCollections.add("com.xs.micro.biz.core.domain.business.account.impl.BorrowerAccountOperationBusinessImpl.rechargeClear");
        idempotentMethodCollections.add("com.xs.micro.biz.core.domain.business.account.impl.self.SelfTransferForUnReportHandler.handle");
        idempotentMethodCollections.add("com.xs.micro.biz.core.domain.business.account.impl.self.SelfTransferForUsableHandler.handle");
        idempotentMethodCollections.add("com.xs.micro.biz.core.domain.business.account.impl.self.SelfTransferJustArriveHandler.handle");
        idempotentMethodCollections.add("com.xs.micro.notice.domain.business.SystemMessageBusiness.issueMessage");
        idempotentMethodCollections.add("com.xs.micro.notice.domain.business.SystemMessageBusiness.batchIssueMessage");
    }

    /**
     * 是否存在这个方法
     * @param className
     * @param methodName
     * @return
     */
    public static boolean exist(String className,String methodName){
        String key = className+SEPARATOR+methodName;
        return idempotentMethodCollections.contains(key);
    }

}