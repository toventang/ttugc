package com.p2082ss.android.ugc.aweme.openshare;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.openshare.entity.DYBaseRequest;
import com.p2082ss.android.ugc.aweme.openshare.entity.DYBaseResp;
import com.p2082ss.android.ugc.aweme.openshare.entity.DYMediaContent;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.openshare.Share */
public final class Share {
    static {
        Covode.recordClassIndex(73535);
    }

    /* renamed from: com.ss.android.ugc.aweme.openshare.Share$Response */
    public static class Response extends DYBaseResp {
        public String state;
        public int subErrorCode;

        static {
            Covode.recordClassIndex(73537);
        }

        @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22348b, com.p2082ss.android.ugc.aweme.openshare.entity.DYBaseResp
        public int getType() {
            return 4;
        }

        public Response() {
        }

        public Response(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22348b, com.p2082ss.android.ugc.aweme.openshare.entity.DYBaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.state = bundle.getString("_aweme_open_sdk_params_state");
            this.subErrorCode = bundle.getInt("_aweme_open_sdk_params_sub_error_code");
        }

        @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22348b, com.p2082ss.android.ugc.aweme.openshare.entity.DYBaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_aweme_open_sdk_params_state", this.state);
            bundle.putInt("_aweme_open_sdk_params_sub_error_code", this.subErrorCode);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.openshare.Share$Request */
    public static class Request extends DYBaseRequest {
        public ArrayList<String> mHashTagList = new ArrayList<>();
        public DYMediaContent mMediaContent;
        public int mTargetSceneType;

        static {
            Covode.recordClassIndex(73536);
        }

        /* renamed from: com_ss_android_ugc_aweme_openshare_Share$Request_com_ss_android_ugc_aweme_lancet_LogLancet_e */
        public static int m113111x7c21c9e(String str, String str2) {
            return 0;
        }

        @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22347a, com.p2082ss.android.ugc.aweme.openshare.entity.DYBaseRequest
        public int getType() {
            return 3;
        }

        public Request() {
        }

        @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22347a
        public boolean checkArgs() {
            DYMediaContent dYMediaContent = this.mMediaContent;
            if (dYMediaContent != null) {
                return dYMediaContent.checkArgs();
            }
            m113111x7c21c9e("Aweme.OpenSDK.Share", "checkArgs fail ,mediaContent is null");
            return false;
        }

        public Request(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22347a, com.p2082ss.android.ugc.aweme.openshare.entity.DYBaseRequest
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.mTargetSceneType = bundle.getInt("_aweme_open_sdk_params_target_landpage_scene", 0);
            this.mHashTagList = bundle.getStringArrayList("_aweme_open_sdk_params_hashtag_list");
            this.mMediaContent = DYMediaContent.C62725a.m113113a(bundle);
        }

        @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22347a, com.p2082ss.android.ugc.aweme.openshare.entity.DYBaseRequest
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            DYMediaContent dYMediaContent = this.mMediaContent;
            Bundle bundle2 = new Bundle();
            if (dYMediaContent.mMediaObject != null) {
                bundle2.putString("_dyobject_identifier_", dYMediaContent.mMediaObject.getClass().getName());
                dYMediaContent.mMediaObject.serialize(bundle2);
            }
            bundle.putAll(bundle2);
            bundle.putInt("_aweme_open_sdk_params_target_landpage_scene", this.mTargetSceneType);
            bundle.putStringArrayList("_aweme_open_sdk_params_hashtag_list", this.mHashTagList);
        }
    }
}
