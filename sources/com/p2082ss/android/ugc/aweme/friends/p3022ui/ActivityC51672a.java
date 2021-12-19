package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.friends.p3013c.C51484e;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.a */
public class ActivityC51672a extends ActivityC17312a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    private int f119116a;

    /* renamed from: b */
    private String f119117b;

    static {
        Covode.recordClassIndex(61035);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(385, new RunnableC90250g(ActivityC51672a.class, "onEvent", C51484e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.n, R.anim.ah);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        C39115e.m79412a(this, findViewById(R.id.acf));
        setResult(0);
        super.onBackPressed();
    }

    @AbstractC90264r
    public void onEvent(C51484e eVar) {
        if (eVar != null) {
            Intent intent = new Intent();
            intent.putExtra("extra_data", eVar.f118670a);
            setResult(-1, intent);
            finish();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78671e = R.attr.m;
        xVar.f78672f = R.attr.m;
        xVar.f78674h = true;
        activityConfiguration(new C51713b(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.b8);
        overridePendingTransition(R.anim.af, R.anim.n);
        findViewById(R.id.acf).setBackgroundColor(C0643b.m2378c(this, R.color.o4));
        this.f119117b = m96385a(getIntent(), "video_id");
        this.f119116a = getIntent().getIntExtra("source", 0);
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        String str = this.f119117b;
        int i = this.f119116a;
        Bundle bundle2 = new Bundle();
        bundle2.putString("video_id", str);
        bundle2.putInt("source", i);
        C51716e eVar = new C51716e();
        eVar.setArguments(bundle2);
        eVar.setUserVisibleHint(true);
        a.mo3469b(R.id.acf, eVar);
        a.mo3467b();
    }

    /* renamed from: a */
    private static String m96385a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m96386a(Fragment fragment, String str, int i) {
        Intent intent = new Intent(fragment.getActivity(), SummonFriendActivity.class);
        intent.putExtra("video_id", str);
        intent.putExtra("source", i);
        fragment.startActivityForResult(intent, 3);
    }
}
