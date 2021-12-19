package com.bytedance.android.livesdk.lynx.p570ui;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2937k;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.jsbridge.AbstractC7033a;
import com.bytedance.android.livesdk.browser.p463d.View$OnClickListenerC6986h;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.p674b.AbstractC11610a;
import com.bytedance.android.livesdkapi.p674b.AbstractC11612b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.p1339a.p1340a.C18738d;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.ui.a */
public abstract class AbstractC9376a extends C10935a implements AbstractC7033a, AbstractC11610a {

    /* renamed from: N */
    public static final C9377a f22869N = new C9377a((byte) 0);

    /* renamed from: G */
    public View$OnClickListenerC6986h.AbstractC6989a f22870G;

    /* renamed from: H */
    public AbstractC9378b f22871H;

    /* renamed from: I */
    public AbstractC2928f.AbstractC2929a f22872I;

    /* renamed from: J */
    protected int f22873J = 2;

    /* renamed from: K */
    public String f22874K = "";

    /* renamed from: L */
    public String f22875L = "";

    /* renamed from: M */
    protected AbstractC11612b f22876M;

    /* renamed from: a */
    private HashMap f22877a;

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.a$b */
    public interface AbstractC9378b {
        static {
            Covode.recordClassIndex(10886);
        }

        /* renamed from: d */
        void mo13277d();

        /* renamed from: e */
        void mo13278e();

        /* renamed from: f */
        void mo13279f();

        /* renamed from: g */
        void mo13280g();
    }

    static {
        Covode.recordClassIndex(10884);
    }

    /* renamed from: f */
    public abstract View mo13302f();

    /* renamed from: i */
    public void mo16274i() {
        HashMap hashMap = this.f22877a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo16274i();
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.a$a */
    public static final class C9377a {
        static {
            Covode.recordClassIndex(10885);
        }

        private C9377a() {
        }

        public /* synthetic */ C9377a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.p674b.AbstractC11610a
    /* renamed from: a */
    public boolean mo13295a(String str) {
        String str2 = "";
        C89219l.m154721d(str, str2);
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action_from", str);
        jSONObject.put("container_id", this.f22874K);
        C18484a aVar = new C18484a("GESTURE_SLIDE_TOOGLE_EVENT", currentTimeMillis, new C18738d(jSONObject));
        String str3 = this.f22874K;
        if (str3 != null) {
            str2 = str3;
        }
        aVar.mo29624a(str2);
        C18494b.m34415a(aVar);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        ActivityC0945e activity;
        Window window;
        ActivityC0945e activity2;
        Window window2;
        ActivityC0945e activity3;
        Window window3;
        super.onActivityCreated(bundle);
        if (this.f22873J == 1) {
            String str = this.f22875L;
            int hashCode = str.hashCode();
            if (hashCode != 830576931) {
                if (hashCode != 1010202942) {
                    if (hashCode == 2003411598 && str.equals("adjustPan") && (activity3 = getActivity()) != null && (window3 = activity3.getWindow()) != null) {
                        window3.setSoftInputMode(32);
                    }
                } else if (str.equals("adjustNothing") && (activity2 = getActivity()) != null && (window2 = activity2.getWindow()) != null) {
                    window2.setSoftInputMode(48);
                }
            } else if (str.equals("adjustResize") && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(18);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i;
        String str;
        AbstractC2928f fVar;
        AbstractC2937k hybridPageManager;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.getBoolean("is_dummy_host", false)) {
                i = 1;
            } else {
                i = 2;
            }
            this.f22873J = i;
            if (i == 1 && (str = this.f22874K) != null && str.length() != 0 && getActivity() != null && (fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)) != null && (hybridPageManager = fVar.getHybridPageManager()) != null) {
                String str2 = this.f22874K;
                if (str2 == null) {
                    C89219l.m154715b();
                }
                ActivityC0945e activity = getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, "");
                hybridPageManager.mo7678a(str2, activity);
            }
        }
    }
}
