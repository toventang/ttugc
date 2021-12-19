package com.bytedance.sdk.p1625a.p1638c.p1639a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.sdk.a.c.a.c */
public final class C22349c {
    static {
        Covode.recordClassIndex(26165);
    }

    /* renamed from: com.bytedance.sdk.a.c.a.c$a */
    public static class C22350a extends AbstractC22347a {

        /* renamed from: a */
        public String f52807a;

        /* renamed from: b */
        public String f52808b;

        /* renamed from: c */
        public String f52809c;

        /* renamed from: d */
        public String f52810d = "opensdk";

        /* renamed from: e */
        public int f52811e = -1;

        /* renamed from: f */
        public String f52812f;

        /* renamed from: g */
        public String f52813g;

        /* renamed from: h */
        public String f52814h;

        static {
            Covode.recordClassIndex(26166);
        }

        @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22347a
        public final int getType() {
            return 1;
        }

        public C22350a() {
        }

        public C22350a(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22347a
        public final void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_bytedance_params_state", this.f52807a);
            bundle.putString("_bytedance_params_client_key", this.f52809c);
            bundle.putString("_bytedance_params_redirect_uri", this.f52808b);
            bundle.putString("_bytedance_params_scope", this.f52812f);
            bundle.putString("_bytedance_params_optional_scope0", this.f52813g);
            bundle.putString("_bytedance_params_optional_scope1", this.f52814h);
            bundle.putInt("wap_requested_orientation", this.f52811e);
            bundle.putString("wap_to_native_from_tag", this.f52810d);
        }

        @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22347a
        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.f52807a = bundle.getString("_bytedance_params_state");
            this.f52809c = bundle.getString("_bytedance_params_client_key");
            this.f52808b = bundle.getString("_bytedance_params_redirect_uri");
            this.f52812f = bundle.getString("_bytedance_params_scope");
            this.f52813g = bundle.getString("_bytedance_params_optional_scope0");
            this.f52814h = bundle.getString("_bytedance_params_optional_scope1");
            this.f52811e = bundle.getInt("wap_requested_orientation", -1);
            this.f52810d = bundle.getString("wap_to_native_from_tag", "opensdk");
        }
    }

    /* renamed from: com.bytedance.sdk.a.c.a.c$b */
    public static class C22351b extends AbstractC22348b {

        /* renamed from: a */
        public String f52815a;

        /* renamed from: b */
        public String f52816b;

        /* renamed from: c */
        public String f52817c;

        static {
            Covode.recordClassIndex(26167);
        }

        @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22348b
        public final int getType() {
            return 2;
        }

        @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22348b
        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.f52815a = bundle.getString("_bytedance_params_authcode");
            this.f52816b = bundle.getString("_bytedance_params_state");
            this.f52817c = bundle.getString("_bytedance_params_granted_permission");
        }

        @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22348b
        public final void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_bytedance_params_authcode", this.f52815a);
            bundle.putString("_bytedance_params_state", this.f52816b);
            bundle.putString("_bytedance_params_granted_permission", this.f52817c);
        }
    }
}
