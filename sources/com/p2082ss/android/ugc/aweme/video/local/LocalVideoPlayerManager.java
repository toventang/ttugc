package com.p2082ss.android.ugc.aweme.video.local;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.C4139e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.p2019b.C27895a;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2003e.C27555f;
import com.google.p1998c.p2003e.EnumC27554e;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager */
public class LocalVideoPlayerManager implements AbstractC33974au {

    /* renamed from: b */
    private static final String f180554b = LocalVideoPlayerManager.class.getSimpleName();

    /* renamed from: c */
    private static LocalVideoPlayerManager f180555c;

    /* renamed from: a */
    public C80758b f180556a = new C80758b();

    /* renamed from: d */
    private AtomicBoolean f180557d = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager$a */
    public interface AbstractC80753a {
        static {
            Covode.recordClassIndex(94044);
        }

        /* renamed from: a */
        void mo96628a();

        /* renamed from: a */
        void mo96629a(String str);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: a */
    public final boolean mo123961a(String str, String str2, AbstractC80753a aVar) {
        String b = m140060b(str);
        boolean z = !TextUtils.isEmpty(b);
        if (z) {
            C1731i.m5640b(new CallableC80768c(b, str2), C1731i.f5562a).mo5534a(new C80769d(aVar, str2), C1731i.f5564c, null);
        }
        return z;
    }

    static {
        Covode.recordClassIndex(94042);
    }

    /* renamed from: e */
    private static boolean m140062e() {
        return C16048b.m29633a().mo25421a(true, "is_local_video_play_enable", true);
    }

    private LocalVideoPlayerManager() {
    }

    /* renamed from: a */
    public static LocalVideoPlayerManager m140055a() {
        MethodCollector.m26663i(1103);
        if (f180555c == null) {
            synchronized (LocalVideoPlayerManager.class) {
                try {
                    if (f180555c == null) {
                        f180555c = new LocalVideoPlayerManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1103);
                    throw th;
                }
            }
        }
        LocalVideoPlayerManager localVideoPlayerManager = f180555c;
        MethodCollector.m26664o(1103);
        return localVideoPlayerManager;
    }

    /* renamed from: d */
    private Map<String, C80770e> m140061d() {
        try {
            String string = C34822d.m71158a(C17867d.m33078a(), "aweme_local_video", 0).getString("extra_data", null);
            if (!TextUtils.isEmpty(string)) {
                return (Map) C4139e.C4140a.f11575b.mo46671a(string, new C27895a<HashMap<String, C80770e>>() {
                    /* class com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.C807521 */

                    static {
                        Covode.recordClassIndex(94043);
                    }
                }.type);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo123962b() {
        try {
            mo123963c();
            SharedPreferences a = C34822d.m71158a(C17867d.m33078a(), "aweme_local_video", 0);
            a.edit().putString("extra_data", C4139e.C4140a.f11575b.mo46674b(this.f180556a.f180572a)).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final void mo123963c() {
        MethodCollector.m26663i(1196);
        if (!m140062e()) {
            MethodCollector.m26664o(1196);
        } else if (!this.f180557d.get()) {
            Map<String, C80770e> d = m140061d();
            synchronized (this) {
                try {
                    if (this.f180557d.compareAndSet(false, true) && d != null && !d.isEmpty()) {
                        this.f180556a.mo123972a(d.values());
                    }
                } finally {
                    MethodCollector.m26664o(1196);
                }
            }
        } else {
            MethodCollector.m26664o(1196);
        }
    }

    /* renamed from: a */
    private static C80770e m140056a(Aweme aweme) {
        return m140057a(aweme.getAid(), aweme.getAuthorUid(), aweme.isVr(), aweme.getVideo());
    }

    /* renamed from: b */
    private String m140060b(String str) {
        mo123963c();
        if (!m140059a(str)) {
            return null;
        }
        C80770e a = this.f180556a.mo123969a(str);
        if (a == null) {
            return "";
        }
        return a.f180595a;
    }

    /* renamed from: a */
    private boolean m140059a(String str) {
        C80770e a;
        if (TextUtils.isEmpty(str) || !m140062e() || (a = this.f180556a.mo123969a(str)) == null || !TextUtils.equals(a.f180596b, C31575b.m65865g().getCurUserId())) {
            return false;
        }
        if (!C80758b.m140078b(this.f180556a.mo123969a(str))) {
            return true;
        }
        this.f180556a.mo123974b(str);
        return false;
    }

    /* renamed from: a */
    public final String mo123959a(VideoUrlModel videoUrlModel) {
        C80770e a;
        String b = m140060b(videoUrlModel.getSourceId());
        if (TextUtils.isEmpty(b) || (a = this.f180556a.mo123969a(videoUrlModel.getSourceId())) == null) {
            return b;
        }
        String uri = a.getUri();
        String uri2 = videoUrlModel.getUri();
        if (uri == null || uri2 == null || TextUtils.equals(uri.split("_")[0], uri2.split("_")[0])) {
            return b;
        }
        this.f180556a.mo123974b(a.getSourceId());
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m140058a(String str, String str2) {
        boolean z;
        File file = new File(str);
        File file2 = new File(str2);
        try {
            if (!file.equals(file2)) {
                z = true;
            } else {
                z = false;
            }
            C27245k.m54241a(z, "Source %s and destination %s must be different", file, file2);
            new C27555f.C27559b(file, (byte) 0).mo46111a(new C27555f.C27558a(file2, new EnumC27554e[0], (byte) 0));
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            C1731i.m5632a((Exception) e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo123960a(String str, Aweme aweme) {
        if (m140062e() && aweme != null) {
            mo123963c();
            C80770e a = m140056a(aweme);
            a.f180595a = str;
            this.f180556a.mo123971a(a);
            mo123962b();
        }
    }

    /* renamed from: a */
    private static C80770e m140057a(String str, String str2, boolean z, Video video) {
        boolean z2;
        C80770e eVar = new C80770e(str);
        eVar.f180596b = str2;
        eVar.setVr(z);
        if (video != null) {
            eVar.setDuration((double) video.getDuration());
            eVar.setWidth(video.getWidth());
            eVar.setHeight(video.getHeight());
            if (video.getProperPlayAddr() != null) {
                eVar.setUri(video.getProperPlayAddr().getUri());
                if (video.getPlayAddrBytevc1() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                eVar.setBytevc1(z2);
            }
        }
        return eVar;
    }
}
