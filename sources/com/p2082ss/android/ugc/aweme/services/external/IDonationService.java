package com.p2082ss.android.ugc.aweme.services.external;

import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.external.IDonationService */
public interface IDonationService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.IDonationService$OnDonationOrgChangeListener */
    public interface OnDonationOrgChangeListener {
        static {
            Covode.recordClassIndex(79796);
        }

        void onDismiss();

        void onOrgSelected(OrganizationModel organizationModel);

        void onShow();
    }

    static {
        Covode.recordClassIndex(79795);
    }

    DialogInterface$OnCancelListenerC0944d getSelectDonationDialog(OnDonationOrgChangeListener onDonationOrgChangeListener);

    /* renamed from: com.ss.android.ugc.aweme.services.external.IDonationService$OrganizationModel */
    public static final class OrganizationModel {
        private String addTime;
        private final String desc;
        private final String detailUrl;
        private final String donateLink;
        private final UrlModel icon;
        private final String name;
        private final Integer ngoId;

        static {
            Covode.recordClassIndex(79797);
        }

        public static /* synthetic */ OrganizationModel copy$default(OrganizationModel organizationModel, String str, String str2, UrlModel urlModel, String str3, String str4, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = organizationModel.name;
            }
            if ((i & 2) != 0) {
                str2 = organizationModel.desc;
            }
            if ((i & 4) != 0) {
                urlModel = organizationModel.icon;
            }
            if ((i & 8) != 0) {
                str3 = organizationModel.detailUrl;
            }
            if ((i & 16) != 0) {
                str4 = organizationModel.donateLink;
            }
            if ((i & 32) != 0) {
                num = organizationModel.ngoId;
            }
            return organizationModel.copy(str, str2, urlModel, str3, str4, num);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.desc;
        }

        public final UrlModel component3() {
            return this.icon;
        }

        public final String component4() {
            return this.detailUrl;
        }

        public final String component5() {
            return this.donateLink;
        }

        public final Integer component6() {
            return this.ngoId;
        }

        public final OrganizationModel copy(String str, String str2, UrlModel urlModel, String str3, String str4, Integer num) {
            return new OrganizationModel(str, str2, urlModel, str3, str4, num);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrganizationModel)) {
                return false;
            }
            OrganizationModel organizationModel = (OrganizationModel) obj;
            return C89219l.m154714a(this.name, organizationModel.name) && C89219l.m154714a(this.desc, organizationModel.desc) && C89219l.m154714a(this.icon, organizationModel.icon) && C89219l.m154714a(this.detailUrl, organizationModel.detailUrl) && C89219l.m154714a(this.donateLink, organizationModel.donateLink) && C89219l.m154714a(this.ngoId, organizationModel.ngoId);
        }

        public final int hashCode() {
            String str = this.name;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.desc;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            UrlModel urlModel = this.icon;
            int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
            String str3 = this.detailUrl;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.donateLink;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Integer num = this.ngoId;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode5 + i;
        }

        public final String toString() {
            return "OrganizationModel(name=" + this.name + ", desc=" + this.desc + ", icon=" + this.icon + ", detailUrl=" + this.detailUrl + ", donateLink=" + this.donateLink + ", ngoId=" + this.ngoId + ")";
        }

        public final String getAddTime() {
            return this.addTime;
        }

        public final String getDesc() {
            return this.desc;
        }

        public final String getDetailUrl() {
            return this.detailUrl;
        }

        public final String getDonateLink() {
            return this.donateLink;
        }

        public final UrlModel getIcon() {
            return this.icon;
        }

        public final String getName() {
            return this.name;
        }

        public final Integer getNgoId() {
            return this.ngoId;
        }

        public final void setAddTime(String str) {
            this.addTime = str;
        }

        public OrganizationModel(String str, String str2, UrlModel urlModel, String str3, String str4, Integer num) {
            this.name = str;
            this.desc = str2;
            this.icon = urlModel;
            this.detailUrl = str3;
            this.donateLink = str4;
            this.ngoId = num;
        }
    }
}
