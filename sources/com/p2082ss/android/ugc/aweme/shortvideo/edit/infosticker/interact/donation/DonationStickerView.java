package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtButton;
import com.bytedance.keva.Keva;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.view.widget.CircleImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerView */
public final class DonationStickerView extends LinearLayout implements AbstractC45904h<C71105c>, AbstractC71109e {

    /* renamed from: b */
    public static final C71095a f159219b = new C71095a((byte) 0);

    /* renamed from: a */
    public C71101b f159220a;

    /* renamed from: c */
    private C71105c f159221c;

    /* renamed from: d */
    private long f159222d;

    /* renamed from: e */
    private boolean f159223e;

    /* renamed from: f */
    private long f159224f;

    /* renamed from: g */
    private final SafeHandler f159225g;

    /* renamed from: h */
    private final CircleImageView f159226h;

    /* renamed from: i */
    private final TextView f159227i;

    /* renamed from: j */
    private final DmtButton f159228j;

    /* renamed from: k */
    private final TextView f159229k;

    static {
        Covode.recordClassIndex(83594);
    }

    public DonationStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerView$a */
    public static final class C71095a {
        static {
            Covode.recordClassIndex(83595);
        }

        private C71095a() {
        }

        public /* synthetic */ C71095a(byte b) {
            this();
        }
    }

    public final long getPlayPosition() {
        return this.f159222d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerView$b */
    public static final class RunnableC71096b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DonationStickerView f159230a;

        static {
            Covode.recordClassIndex(83596);
        }

        RunnableC71096b(DonationStickerView donationStickerView) {
            this.f159230a = donationStickerView;
        }

        public final void run() {
            this.f159230a.mo112349b();
        }
    }

    /* renamed from: e */
    private final boolean m125653e() {
        C71105c cVar = this.f159221c;
        if (cVar == null || cVar.f159248d == 0) {
            return false;
        }
        return true;
    }

    public final C71101b getStickerController() {
        C71101b bVar = this.f159220a;
        if (bVar == null) {
            C89219l.m154710a("stickerController");
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C71105c mo112346a() {
        C71105c cVar = this.f159221c;
        if (cVar == null) {
            return new C71105c(null, 15);
        }
        C71101b bVar = this.f159220a;
        if (bVar == null) {
            C89219l.m154710a("stickerController");
        }
        cVar.f159246b = bVar.mo112284c();
        return cVar;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.sticker.data.e' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: c */
    public final /* synthetic */ C71105c mo65021c() {
        return C71105c.m125682a(mo112346a());
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: d */
    public final int mo65022d() {
        if (!m125653e()) {
            return 0;
        }
        C71105c cVar = this.f159221c;
        if (cVar == null) {
            C89219l.m154715b();
        }
        return cVar.f159247c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r3 <= ((long) r0.f159248d)) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (8 == getVisibility()) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo112349b() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c r0 = r7.f159221c
            r5 = 0
            if (r0 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b r1 = r7.f159220a
            if (r1 != 0) goto L_0x000e
            java.lang.String r0 = "stickerController"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x000e:
            boolean r0 = r1.mo112312a()
            if (r0 != 0) goto L_0x0057
            boolean r0 = r7.f159223e
            if (r0 != 0) goto L_0x0057
            boolean r0 = r7.m125653e()
            r6 = 1
            if (r0 == 0) goto L_0x003f
            long r3 = r7.f159222d
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c r0 = r7.f159221c
            if (r0 != 0) goto L_0x0028
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0028:
            int r0 = r0.f159247c
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0054
            long r3 = r7.f159222d
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c r0 = r7.f159221c
            if (r0 != 0) goto L_0x0038
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0038:
            int r0 = r0.f159248d
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0054
        L_0x003f:
            r2 = 1
            r1 = 8
            if (r2 == 0) goto L_0x0055
            int r0 = r7.getVisibility()
            if (r1 != r0) goto L_0x0055
        L_0x004a:
            r0 = r7
            if (r2 == 0) goto L_0x0051
        L_0x004d:
            com.p2082ss.android.ugc.aweme.shortvideo.C71827ew.m126829b(r0, r5)
            return r6
        L_0x0051:
            r5 = 8
            goto L_0x004d
        L_0x0054:
            r2 = 0
        L_0x0055:
            r6 = 0
            goto L_0x004a
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerView.mo112349b():boolean");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.AbstractC71109e
    /* renamed from: a */
    public final void mo112347a(float f) {
        setAlpha(f);
    }

    public final void setPlayPosition(long j) {
        this.f159222d = j;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.AbstractC71109e
    public final void setEndTime(int i) {
        C71105c cVar = this.f159221c;
        if (cVar != null) {
            cVar.f159248d = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.AbstractC71109e
    public final void setStartTime(int i) {
        C71105c cVar = this.f159221c;
        if (cVar != null) {
            cVar.f159247c = i;
        }
    }

    public final void setStickerController(C71101b bVar) {
        C89219l.m154721d(bVar, "");
        this.f159220a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: a */
    public final int mo65014a(int i) {
        if (!m125653e()) {
            return i;
        }
        C71105c cVar = this.f159221c;
        if (cVar == null) {
            C89219l.m154715b();
        }
        return cVar.f159247c;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: b */
    public final int mo65018b(int i) {
        if (!m125653e()) {
            return i;
        }
        C71105c cVar = this.f159221c;
        if (cVar == null) {
            C89219l.m154715b();
        }
        return cVar.f159248d;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: c */
    public final int mo65020c(int i) {
        if (!m125653e()) {
            return i;
        }
        C71105c cVar = this.f159221c;
        if (cVar == null) {
            C89219l.m154715b();
        }
        return cVar.f159248d;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45897c
    public final void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        setAlpha(f);
    }

    public final void setDonationStickerData(C71105c cVar) {
        C89219l.m154721d(cVar, "");
        this.f159221c = cVar;
        AbstractC82771b bVar = cVar.f159245a;
        if (bVar != null) {
            mo112348a(bVar);
        }
        this.f159229k.setText(Keva.getRepo("donation_sticker").getString("donation_match_text", ""));
    }

    public final void setTouching(boolean z) {
        if (z != this.f159223e) {
            this.f159223e = z;
            if (!z) {
                this.f159224f = SystemClock.elapsedRealtime();
                this.f159225g.postDelayed(new RunnableC71096b(this), 1000);
            }
        }
    }

    /* renamed from: a */
    public final void mo112348a(AbstractC82771b bVar) {
        C89219l.m154721d(bVar, "");
        UrlModel icon = bVar.getIcon();
        if (icon != null) {
            C84402a.m145169a(this.f159226h, icon, -1, -1);
        }
        TextView textView = this.f159227i;
        String string = getContext().getString(R.string.baj);
        C89219l.m154716b(string, "");
        String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{bVar.getName()}, 1));
        C89219l.m154716b(a, "");
        textView.setText(a);
    }

    private /* synthetic */ DonationStickerView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DonationStickerView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8883);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.y3, this, true);
        View findViewById = findViewById(R.id.cxc);
        C89219l.m154716b(findViewById, "");
        CircleImageView circleImageView = (CircleImageView) findViewById;
        this.f159226h = circleImageView;
        View findViewById2 = findViewById(R.id.ebr);
        C89219l.m154716b(findViewById2, "");
        this.f159227i = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.xh);
        C89219l.m154716b(findViewById3, "");
        DmtButton dmtButton = (DmtButton) findViewById3;
        this.f159228j = dmtButton;
        View findViewById4 = findViewById(R.id.ane);
        C89219l.m154716b(findViewById4, "");
        this.f159229k = (TextView) findViewById4;
        C24246a aVar = (C24246a) circleImageView.getHierarchy();
        C89219l.m154716b(aVar, "");
        C24250e eVar = aVar.f57470a;
        if (eVar != null) {
            eVar.mo39985c(C13628n.m24520b(context, 0.5f));
        }
        C24246a aVar2 = (C24246a) circleImageView.getHierarchy();
        C89219l.m154716b(aVar2, "");
        C24250e eVar2 = aVar2.f57470a;
        if (eVar2 != null) {
            eVar2.f57504f = C0643b.m2378c(context, R.color.b2);
        }
        dmtButton.setEnabled(false);
        dmtButton.setClickable(false);
        Activity a = C67279a.m119194a(context);
        if (a != null) {
            this.f159225g = new SafeHandler((ActivityC0218d) a);
            MethodCollector.m26664o(8883);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        MethodCollector.m26664o(8883);
        throw nullPointerException;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.sticker.data.e, int, int] */
    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: a */
    public final /* synthetic */ void mo65017a(C71105c cVar, int i, int i2) {
        C71105c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        NormalTrackTimeStamp a = C71073b.m125560a(cVar2.f159246b);
        C71101b bVar = this.f159220a;
        if (bVar == null) {
            C89219l.m154710a("stickerController");
        }
        NormalTrackTimeStamp a2 = C71073b.m125560a(bVar.mo112284c());
        C71105c cVar3 = this.f159221c;
        if (cVar3 != null) {
            cVar3.f159247c = cVar2.f159247c;
        }
        C71105c cVar4 = this.f159221c;
        if (cVar4 != null) {
            cVar4.f159248d = cVar2.f159248d;
        }
        if (a != null && a2 != null) {
            a.setRotation(a.getRotation() - a2.getRotation());
            if (!C89219l.m154712a(a2.getScale(), 0.0f)) {
                float floatValue = a.getScale().floatValue();
                Float scale = a2.getScale();
                C89219l.m154716b(scale, "");
                a.setScale(Float.valueOf(floatValue / scale.floatValue()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(a);
            String b = C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(arrayList);
            InteractStickerStruct interactStickerStruct = cVar2.f159246b;
            if (interactStickerStruct != null) {
                interactStickerStruct.setTrackList(b);
            }
            C71101b bVar2 = this.f159220a;
            if (bVar2 == null) {
                C89219l.m154710a("stickerController");
            }
            bVar2.mo112316b(false);
            C71101b bVar3 = this.f159220a;
            if (bVar3 == null) {
                C89219l.m154710a("stickerController");
            }
            bVar3.mo112311a(cVar2.f159246b, (Boolean) false);
            C71101b bVar4 = this.f159220a;
            if (bVar4 == null) {
                C89219l.m154710a("stickerController");
            }
            bVar4.mo112316b(true);
        }
    }
}
