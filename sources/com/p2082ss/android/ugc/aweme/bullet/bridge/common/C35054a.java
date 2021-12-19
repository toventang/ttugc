package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.utils.C80437fl;
import com.p2082ss.android.ugc.trill.R;
import com.zhihu.matisse.C87936a;
import com.zhihu.matisse.EnumC87938b;
import com.zhihu.matisse.internal.entity.C87955b;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.p4511a.AbstractC87937a;
import java.io.FileNotFoundException;
import p078c.p080b.C1756d;
import p078c.p080b.C1757e;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.a */
final /* synthetic */ class C35054a implements C35444b.AbstractC35447b {

    /* renamed from: a */
    private final UploadFileMethod f82709a;

    /* renamed from: b */
    private final Activity f82710b;

    static {
        Covode.recordClassIndex(42165);
    }

    C35054a(UploadFileMethod uploadFileMethod, Activity activity) {
        this.f82709a = uploadFileMethod;
        this.f82710b = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
    /* renamed from: a */
    public final void mo53515a(String[] strArr, int[] iArr) {
        UploadFileMethod uploadFileMethod = this.f82709a;
        Activity activity = this.f82710b;
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                try {
                    C87936a.m152942a(activity).mo142434a(EnumC87938b.ofImage()).mo142439a().mo142444c().mo142440a(1).mo142445d().mo142442b().mo142441a(new AbstractC87937a() {
                        /* class com.p2082ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod.C350511 */

                        static {
                            Covode.recordClassIndex(42162);
                        }

                        @Override // com.zhihu.matisse.p4511a.AbstractC87937a
                        /* renamed from: a */
                        public final C87955b mo61898a(Context context, Item item) {
                            Uri uri = item.f199738c;
                            if (uri == null || C13627m.m24498a(uri.toString())) {
                                return new C87955b(context.getString(R.string.doo), (byte) 0);
                            }
                            try {
                                if (C1756d.m5891a(C17867d.m33078a(), uri) == null) {
                                    return new C87955b(context.getString(R.string.doo), (byte) 0);
                                }
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            if (UploadFileMethod.this.f82691n == 0 || C1757e.m5900a(C17867d.m33078a(), uri) <= UploadFileMethod.this.f82691n) {
                                return null;
                            }
                            return new C87955b(context.getString(R.string.dq, C80437fl.m139445a(UploadFileMethod.this.f82691n)), (byte) 0);
                        }
                    }).mo142443b(10003);
                } catch (Exception e) {
                    C51423a.m95788a("", e);
                    C30128d.m60944a(activity);
                }
            } else {
                new C23144b(activity).mo37635a(activity.getString(R.string.dng)).mo37637b();
                uploadFileMethod.mo61896g();
            }
        }
    }
}
