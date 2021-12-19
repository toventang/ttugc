package com.p2082ss.ttvideoengine;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttm.player.AbstractC86246f;
import com.p2082ss.ttm.player.AbstractC86253m;
import com.p2082ss.ttm.player.AbstractC86265n;
import com.p2082ss.ttm.player.AudioProcessor;
import com.p2082ss.ttm.player.C86266o;
import com.p2082ss.ttm.player.C86275p;
import com.p2082ss.ttm.player.IMediaDataSource;
import com.p2082ss.ttm.player.LoadControl;
import com.p2082ss.ttm.player.MaskInfo;
import com.p2082ss.ttm.player.SubInfo;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import java.io.FileDescriptor;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.ss.ttvideoengine.m */
public class C86572m implements AbstractC86253m {

    /* renamed from: e */
    private static boolean f195053e;

    /* renamed from: a */
    public AbstractC86265n f195054a;

    /* renamed from: b */
    public boolean f195055b;

    /* renamed from: d */
    public String f195056d = "";

    static {
        Covode.recordClassIndex(101800);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final boolean mo16707a() {
        return this.f195054a instanceof C86266o;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16692a(SurfaceHolder surfaceHolder) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136748b(surfaceHolder);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16691a(Surface surface) {
        AbstractC86265n nVar;
        if ((surface == null || surface.isValid()) && (nVar = this.f195054a) != null) {
            nVar.mo136727a(surface);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16690a(Context context, Uri uri, Map<String, String> map) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136726a(context, uri, map);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16704a(FileDescriptor fileDescriptor, long j, long j2) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136741a(fileDescriptor, j, j2);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16693a(IMediaDataSource iMediaDataSource) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136729a(iMediaDataSource);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16706a(boolean z) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136743a(z);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16694a(AbstractC86253m.AbstractC86254a aVar) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136731a(aVar);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16695a(AbstractC86253m.AbstractC86255b bVar) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136732a(bVar);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16696a(AbstractC86253m.AbstractC86256c cVar) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136733a(cVar);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16698a(AbstractC86253m.AbstractC86258e eVar) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136735a(eVar);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16697a(AbstractC86253m.AbstractC86257d dVar) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136734a(dVar);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16702a(AbstractC86253m.AbstractC86264k kVar) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136739a(kVar);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16699a(AbstractC86253m.AbstractC86260g gVar) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136736a(gVar);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16700a(AbstractC86253m.AbstractC86262i iVar) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136737a(iVar);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16701a(AbstractC86253m.AbstractC86263j jVar) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136738a(jVar);
        }
    }

    /* renamed from: a */
    public final void mo137830a(AbstractC86246f fVar) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136730a(fVar);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16705a(String str) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136742a(str);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16703a(C86275p pVar) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136740a(pVar);
        }
    }

    /* renamed from: a */
    public final void mo137826a(AudioProcessor audioProcessor) {
        if (this.f195054a != null) {
            try {
                Method method = C86640h.m150079a(200, "com.ss.ttm.player.TTPlayerClient").getMethod("setAudioProcessor", AudioProcessor.class);
                method.setAccessible(true);
                method.invoke(this.f195054a, audioProcessor);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo137827a(LoadControl loadControl) {
        if (this.f195054a != null) {
            try {
                Method method = C86640h.m150079a(200, "com.ss.ttm.player.TTPlayerClient").getMethod("setLoadControl", LoadControl.class);
                method.setAccessible(true);
                method.invoke(this.f195054a, loadControl);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo137828a(MaskInfo maskInfo) {
        if (this.f195054a != null) {
            try {
                Method method = C86640h.m150079a(200, "com.ss.ttm.player.TTPlayerClient").getMethod("setMaskInfo", MaskInfo.class);
                method.setAccessible(true);
                method.invoke(this.f195054a, maskInfo);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo137829a(SubInfo subInfo) {
        if (this.f195054a != null) {
            try {
                Method method = C86640h.m150079a(200, "com.ss.ttm.player.TTPlayerClient").getMethod("setSubInfo", SubInfo.class);
                method.setAccessible(true);
                method.invoke(this.f195054a, subInfo);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: c */
    public final void mo16714c() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136760i();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: d */
    public final void mo16716d() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136753d();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: e */
    public final void mo16717e() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136761j();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: f */
    public final void mo16718f() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136754e();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: g */
    public final void mo16719g() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136755f();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: h */
    public final void mo16720h() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136756g();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: i */
    public final void mo16721i() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136758h();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: j */
    public final void mo16722j() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136762k();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: q */
    public final void mo16729q() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136768q();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: k */
    public final int mo16723k() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            return nVar.mo136763l();
        }
        return 0;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: l */
    public final int mo16724l() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            return nVar.mo136764m();
        }
        return 0;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: m */
    public final int mo16725m() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            return nVar.mo136765n();
        }
        return 0;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: n */
    public final int mo16726n() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            return nVar.mo136766o();
        }
        return 0;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: o */
    public final int mo16727o() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            return nVar.mo136769r();
        }
        return 0;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: p */
    public final boolean mo16728p() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            return nVar.mo136767p();
        }
        return false;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: r */
    public final boolean mo16730r() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            return nVar.mo136770s();
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m149840s() {
        if (f195053e) {
            return true;
        }
        try {
            C86640h.m150079a(200, "com.ss.ttm.player.TTPlayerClient");
            f195053e = true;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: t */
    public static String m149841t() {
        try {
            return C86640h.m150079a(201, "com.ss.ttmplugin.player.TTVersion").getField("VERSION_NAME").get(null).toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: b */
    public final int mo16709b() {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            return nVar.mo136751c();
        }
        return 0;
    }

    /* renamed from: u */
    public final Object mo137831u() {
        if (this.f195054a == null) {
            return null;
        }
        try {
            Method method = C86640h.m150079a(200, "com.ss.ttm.player.TTPlayerClient").getMethod("getObjectOption", Integer.TYPE);
            method.setAccessible(true);
            return method.invoke(this.f195054a, 521);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: b */
    public final void mo16712b(boolean z) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136749b(z);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: b */
    public final float mo16708b(int i) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            return nVar.mo136750c(i);
        }
        return 0.0f;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: c */
    public final String mo16713c(int i) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            return nVar.mo136746b(i);
        }
        return null;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16686a(int i) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136722a(i);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16685a(float f, float f2) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136721a(f, f2);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final int mo16683a(int i, float f) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar == null) {
            return 0;
        }
        nVar.mo136717a(i, f);
        return 0;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final long mo16684a(int i, long j) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            return nVar.mo136745b(i, j);
        }
        return j;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: c */
    public final void mo16715c(int i, int i2) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136723a(i, i2);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: b */
    public final int mo16710b(int i, int i2) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            return nVar.mo136752c(i, i2);
        }
        return i2;
    }

    /* renamed from: a */
    private static boolean m149839a(Context context, C86572m mVar) {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("com.ss.ttexo.ExoPlayerClient");
            Method declaredMethod = cls.getDeclaredMethod("create", AbstractC86253m.class, Context.class);
            declaredMethod.setAccessible(true);
            mVar.f195054a = (AbstractC86265n) declaredMethod.invoke(cls, mVar, context);
            z = true;
            return true;
        } catch (Throwable th) {
            mVar.f195055b = true;
            mVar.f195056d += th.toString();
            return z;
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: b */
    public final long mo16711b(int i, long j) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            return (long) nVar.mo136718a(i, j);
        }
        return -1;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16687a(int i, int i2) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136744b(i, i2);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16688a(int i, String str) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136719a(i, str);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86253m
    /* renamed from: a */
    public final void mo16689a(Context context, Uri uri) {
        AbstractC86265n nVar = this.f195054a;
        if (nVar != null) {
            nVar.mo136725a(context, uri);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (m149839a(r13, r1) != false) goto L_0x0271;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0275  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.ttm.player.AbstractC86253m m149838a(android.content.Context r13, int r14, java.util.HashMap<java.lang.Integer, java.lang.Integer> r15) {
        /*
        // Method dump skipped, instructions count: 722
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86572m.m149838a(android.content.Context, int, java.util.HashMap):com.ss.ttm.player.m");
    }
}
