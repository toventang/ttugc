package com.p2082ss.android.ugc.aweme.specact.popup.p3943b;

import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.specact.popup.api.SpecActRedPacketApi;
import com.p2082ss.android.ugc.aweme.specact.popup.calendar.C75190a;
import com.p2082ss.android.ugc.aweme.specact.popup.calendar.C75194b;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75117b;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75119d;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75122g;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75124i;
import com.p2082ss.android.ugc.aweme.specact.popup.p3943b.C75143b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.b.e */
public final class C75153e {

    /* renamed from: a */
    public String f168978a;

    /* renamed from: b */
    public String f168979b;

    /* renamed from: c */
    public String f168980c;

    /* renamed from: d */
    public C75157c f168981d;

    /* renamed from: e */
    public C75122g f168982e;

    /* renamed from: f */
    public C75119d f168983f;

    /* renamed from: g */
    public List<String> f168984g = new ArrayList();

    /* renamed from: h */
    public EnumC75158d f168985h;

    /* renamed from: i */
    public C75159e[] f168986i;

    /* renamed from: j */
    public String f168987j;

    /* renamed from: k */
    public C75155a f168988k;

    /* renamed from: l */
    public AbstractC89183m<? super DialogC75175j, ? super C75153e, C89391z> f168989l = new AbstractC89183m<DialogC75175j, C75153e, C89391z>(this) {
        /* class com.p2082ss.android.ugc.aweme.specact.popup.p3943b.C75153e.C751541 */

        /* renamed from: a */
        final /* synthetic */ C75153e f168992a;

        static {
            Covode.recordClassIndex(88030);
        }

        {
            this.f168992a = r2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(DialogC75175j jVar, C75153e eVar) {
            DialogC75175j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            C89219l.m154721d(eVar, "");
            C75143b bVar = new C75143b(this.f168992a.f168991n);
            C89219l.m154721d(jVar2, "");
            SpecActRedPacketApi.C75139a.m131891a(bVar.f168964c, "False");
            if (!bVar.f168964c.f168892l.isEmpty()) {
                bVar.f168962a = bVar.f168964c.f168892l.get(0);
                C75117b bVar2 = bVar.f168962a;
                if (bVar2 == null) {
                    C89219l.m154710a("buttonAction");
                }
                if (bVar2.f168863f == 0 && bVar.f168964c.f168895o.f168873a.f168866b.length() != 0) {
                    String a = C75190a.m131922a(bVar.f168964c.f168884d, "register");
                    long j = bVar.f168964c.f168895o.f168873a.f168865a * 1000;
                    C75190a.m131924a(jVar2.f169035d, new C75194b(a, null, j, j, TimeUnit.MINUTES.toMillis(1), bVar.f168964c.f168895o.f168873a.f168866b, bVar.f168964c.f168895o.f168873a.f168867c, "feed", 142), false, new C75143b.C75149f(bVar, jVar2));
                    jVar2.dismiss();
                } else {
                    bVar.f168963b = jVar2.f169035d;
                    TextView textView = jVar2.f169033b;
                    if (textView != null) {
                        textView.setText("");
                    }
                    ImageView imageView = jVar2.f169032a;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    jVar2.f169034c = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                    RotateAnimation rotateAnimation = jVar2.f169034c;
                    if (rotateAnimation != null) {
                        rotateAnimation.setDuration(1000);
                        rotateAnimation.setRepeatCount(-1);
                        rotateAnimation.setInterpolator(new LinearInterpolator());
                        rotateAnimation.setFillAfter(true);
                    }
                    ImageView imageView2 = jVar2.f169032a;
                    if (imageView2 != null) {
                        imageView2.startAnimation(jVar2.f169034c);
                    }
                    C1731i.m5640b(new C75143b.CallableC75147d(bVar), C1731i.f5562a).mo5538b(new C75143b.C75148e(bVar, jVar2), C1731i.f5564c);
                }
            }
            return C89391z.f203057a;
        }
    };

    /* renamed from: m */
    public Boolean f168990m;

    /* renamed from: n */
    public final C75124i f168991n;

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.e$b */
    public enum EnumC75156b {
        YELLOW,
        SIMPLE;

        static {
            Covode.recordClassIndex(88032);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.e$d */
    public enum EnumC75158d {
        COIN,
        COIN2,
        CALENDAR;

        static {
            Covode.recordClassIndex(88034);
        }
    }

    static {
        Covode.recordClassIndex(88029);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.e$c */
    public static final class C75157c {

        /* renamed from: a */
        public final String f168998a;

        /* renamed from: b */
        public final EnumC75158d f168999b;

        static {
            Covode.recordClassIndex(88033);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75157c)) {
                return false;
            }
            C75157c cVar = (C75157c) obj;
            return C89219l.m154714a(this.f168998a, cVar.f168998a) && C89219l.m154714a(this.f168999b, cVar.f168999b);
        }

        public final int hashCode() {
            String str = this.f168998a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            EnumC75158d dVar = this.f168999b;
            if (dVar != null) {
                i = dVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "Content(content=" + this.f168998a + ", icon=" + this.f168999b + ")";
        }

        public /* synthetic */ C75157c(String str) {
            this(str, null);
        }

        public C75157c(String str, EnumC75158d dVar) {
            C89219l.m154721d(str, "");
            this.f168998a = str;
            this.f168999b = dVar;
        }
    }

    /* renamed from: a */
    public final void mo118313a(List<String> list) {
        C89219l.m154721d(list, "");
        this.f168984g = list;
    }

    public C75153e(C75124i iVar) {
        C89219l.m154721d(iVar, "");
        this.f168991n = iVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.e$e */
    public static final class C75159e {

        /* renamed from: a */
        public final String f169001a;

        /* renamed from: b */
        public final String f169002b;

        /* renamed from: c */
        public final boolean f169003c;

        static {
            Covode.recordClassIndex(88035);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75159e)) {
                return false;
            }
            C75159e eVar = (C75159e) obj;
            return C89219l.m154714a(this.f169001a, eVar.f169001a) && C89219l.m154714a(this.f169002b, eVar.f169002b) && this.f169003c == eVar.f169003c;
        }

        public final int hashCode() {
            String str = this.f169001a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f169002b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.f169003c;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public final String toString() {
            return "ListModel(key=" + this.f169001a + ", value=" + this.f169002b + ", isBold=" + this.f169003c + ")";
        }

        public C75159e(String str, String str2, boolean z) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f169001a = str;
            this.f169002b = str2;
            this.f169003c = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.e$a */
    public static final class C75155a {

        /* renamed from: a */
        public final String f168993a;

        /* renamed from: b */
        public final EnumC75156b f168994b;

        /* renamed from: c */
        public final EnumC75158d f168995c;

        /* renamed from: d */
        public final String f168996d;

        static {
            Covode.recordClassIndex(88031);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C75155a)) {
                return false;
            }
            C75155a aVar = (C75155a) obj;
            return C89219l.m154714a(this.f168993a, aVar.f168993a) && C89219l.m154714a(this.f168994b, aVar.f168994b) && C89219l.m154714a(this.f168995c, aVar.f168995c) && C89219l.m154714a(this.f168996d, aVar.f168996d);
        }

        public final int hashCode() {
            String str = this.f168993a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            EnumC75156b bVar = this.f168994b;
            int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
            EnumC75158d dVar = this.f168995c;
            int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
            String str2 = this.f168996d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            return "Button(content=" + this.f168993a + ", style=" + this.f168994b + ", icon=" + this.f168995c + ", image=" + this.f168996d + ")";
        }

        public C75155a(String str, EnumC75156b bVar, EnumC75158d dVar, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str2, "");
            this.f168993a = str;
            this.f168994b = bVar;
            this.f168995c = dVar;
            this.f168996d = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C75155a(String str, EnumC75156b bVar, EnumC75158d dVar, String str2, int i) {
            this(str, bVar, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? "" : str2);
        }
    }
}
