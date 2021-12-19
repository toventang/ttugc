package com.bytedance.android.live.broadcast.widget;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.C2993a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p379n.AbstractC5773g;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverCropCustomStyleSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11275l;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.live.broadcast.widget.e */
public final class View$OnClickListenerC3783e implements View.OnClickListener {

    /* renamed from: k */
    private static int f10484k = 1;

    /* renamed from: l */
    private static int f10485l = 1;

    /* renamed from: m */
    private static int f10486m = 750;

    /* renamed from: n */
    private static int f10487n = 750;

    /* renamed from: a */
    HSImageView f10488a;

    /* renamed from: b */
    public TextView f10489b;

    /* renamed from: c */
    C10935a f10490c;

    /* renamed from: d */
    public AbstractC5773g f10491d;

    /* renamed from: e */
    public String f10492e;

    /* renamed from: f */
    public final C88411a f10493f;

    /* renamed from: g */
    public DataChannel f10494g;

    /* renamed from: h */
    public boolean f10495h;

    /* renamed from: i */
    public C2993a f10496i;

    /* renamed from: j */
    User f10497j;

    /* renamed from: b */
    public final void mo9121b() {
        if (this.f10492e == null) {
            this.f10491d.mo11516c();
        }
    }

    static {
        Covode.recordClassIndex(4309);
    }

    /* renamed from: a */
    public final String mo9119a() {
        C2993a aVar = this.f10496i;
        if (aVar == null) {
            return "";
        }
        if (aVar.f8813a != null) {
            return this.f10496i.f8813a;
        }
        if (!C13603b.m24435a((Collection) this.f10496i.f8814b)) {
            return Uri.parse(this.f10496i.f8814b.get(0)).toString();
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo9122c() {
        EnumC11728i iVar = (EnumC11728i) C17846f.m33055a(this.f10490c).mo28318b(C3802x.class);
        if (iVar == null || iVar.equals(EnumC11728i.VIDEO) || !iVar.equals(EnumC11728i.THIRD_PARTY)) {
            return "video_live";
        }
        return "third_party";
    }

    /* renamed from: a */
    public static C2993a m9353a(ImageModel imageModel) {
        if (imageModel == null) {
            return null;
        }
        C2993a aVar = new C2993a();
        aVar.f8813a = imageModel.mUri;
        aVar.f8814b = imageModel.mUrls;
        return aVar;
    }

    /* renamed from: a */
    public final void mo9120a(Throwable th) {
        String str;
        if (th instanceof C2912a) {
            str = ((C2912a) th).getErrorMsg();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = C3966y.m9657a((int) R.string.guc);
        }
        this.f10492e = null;
        if (this.f10490c.isViewValid()) {
            this.f10491d.mo11515b();
            C11226ao.m19883a(C3966y.m9669e(), str, 0);
        }
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.ca_) {
            mo9121b();
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", mo9122c());
            User user = this.f10497j;
            if (user != null) {
                hashMap.put("anchor_id", String.valueOf(user.getId()));
            }
            C3868c.m9492a("ttlive_upload_cover_start", 0, (JSONObject) null);
            C6501b.C6502a.m13948a("livesdk_cover_modify_click").mo12643a(this.f10494g).mo12656c("click").mo12654b("live").mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }

    public View$OnClickListenerC3783e(View view, C10935a aVar, DataChannel dataChannel) {
        this(view, aVar, f10484k, f10485l, dataChannel);
    }

    private View$OnClickListenerC3783e(View view, C10935a aVar, int i, int i2, DataChannel dataChannel) {
        AbstractC2994b bVar;
        boolean z;
        this.f10493f = new C88411a();
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        User user = null;
        if (b != null) {
            bVar = b.mo13147a();
        } else {
            bVar = null;
        }
        this.f10497j = bVar instanceof User ? (User) bVar : user;
        this.f10494g = dataChannel;
        f10484k = i;
        f10485l = i2;
        if (i > i2) {
            f10486m = 480;
            f10487n = 270;
        } else if (i < i2) {
            f10486m = 270;
            f10487n = 480;
        }
        int value = LiveCoverMinSizeSetting.INSTANCE.getValue();
        f10486m = value;
        f10487n = value;
        this.f10490c = aVar;
        HSImageView hSImageView = (HSImageView) view.findViewById(R.id.ca_);
        this.f10488a = hSImageView;
        hSImageView.setOnClickListener(this);
        this.f10489b = (TextView) view.findViewById(R.id.eyp);
        ActivityC0945e activity = this.f10490c.getActivity();
        C10935a aVar2 = this.f10490c;
        int i3 = f10484k;
        int i4 = f10485l;
        int i5 = f10486m;
        int i6 = f10487n;
        C3785f fVar = new C3785f(this);
        if (Build.VERSION.SDK_INT > 29 || LiveCoverCropCustomStyleSetting.INSTANCE.enable()) {
            z = true;
        } else {
            z = false;
        }
        this.f10491d = new C11275l(activity, aVar2, "cover", i3, i4, i5, i6, fVar, z);
        if (this.f10490c.isViewValid()) {
            this.f10489b.setAlpha(0.64f);
        }
    }
}
