package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p983b.C14621d;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.google.android.material.bottomsheet.C26614b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.p2310al.C33489d;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.CountDownStickerApi;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.EnumC72887a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C72901a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C72902b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C72975f;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.ProgressDialogC72983g;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k */
public final class C73009k extends C26614b {

    /* renamed from: h */
    public static final C73010a f163844h = new C73010a((byte) 0);

    /* renamed from: a */
    public CountDownStickerStruct f163845a;

    /* renamed from: b */
    public Aweme f163846b;

    /* renamed from: c */
    public TextView f163847c;

    /* renamed from: d */
    public C88411a f163848d;

    /* renamed from: e */
    public ProgressDialogC72983g f163849e;

    /* renamed from: f */
    String f163850f;

    /* renamed from: g */
    public boolean f163851g;

    /* renamed from: i */
    private LinearLayout f163852i;

    /* renamed from: j */
    private ImageView f163853j;

    /* renamed from: k */
    private Button f163854k;

    /* renamed from: l */
    private Button f163855l;

    /* renamed from: m */
    private AbstractC73011b f163856m = AbstractC73011b.C73016e.f163865a;

    /* renamed from: n */
    private final CountDownStickerApi f163857n;

    /* renamed from: o */
    private String f163858o;

    /* renamed from: p */
    private String f163859p;

    /* renamed from: q */
    private SparseArray f163860q;

    static {
        Covode.recordClassIndex(85712);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$a */
    public static final class C73010a {
        static {
            Covode.recordClassIndex(85713);
        }

        private C73010a() {
        }

        public /* synthetic */ C73010a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C73009k m128928a(CountDownStickerStruct countDownStickerStruct, Aweme aweme, C75391j jVar) {
            String str;
            String str2;
            C75384i iVar;
            C75384i iVar2;
            C75384i iVar3;
            String str3 = null;
            if (countDownStickerStruct == null) {
                return null;
            }
            C73009k kVar = new C73009k();
            Bundle bundle = new Bundle();
            bundle.putSerializable("countdown_sticker_data", countDownStickerStruct);
            bundle.putSerializable("countdown_sticker_aweme", aweme);
            if (jVar == null || (iVar3 = jVar.f169463r) == null) {
                str = null;
            } else {
                str = iVar3.f169429c;
            }
            bundle.putString("group_id", str);
            if (jVar == null || (iVar2 = jVar.f169463r) == null) {
                str2 = null;
            } else {
                str2 = iVar2.f169428b;
            }
            bundle.putString("author_id", str2);
            if (!(jVar == null || (iVar = jVar.f169463r) == null)) {
                str3 = iVar.f169427a;
            }
            bundle.putString("enter_from", str3);
            kVar.setArguments(bundle);
            return kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$b */
    public static abstract class AbstractC73011b {
        static {
            Covode.recordClassIndex(85714);
        }

        private AbstractC73011b() {
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$b$a */
        public static final class C73012a extends AbstractC73011b {

            /* renamed from: a */
            public static final C73012a f163861a = new C73012a();

            private C73012a() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85715);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$b$b */
        public static final class C73013b extends AbstractC73011b {

            /* renamed from: a */
            public static final C73013b f163862a = new C73013b();

            private C73013b() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85716);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$b$c */
        public static final class C73014c extends AbstractC73011b {

            /* renamed from: a */
            public static final C73014c f163863a = new C73014c();

            private C73014c() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85717);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$b$d */
        public static final class C73015d extends AbstractC73011b {

            /* renamed from: a */
            public static final C73015d f163864a = new C73015d();

            private C73015d() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85718);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$b$e */
        public static final class C73016e extends AbstractC73011b {

            /* renamed from: a */
            public static final C73016e f163865a = new C73016e();

            private C73016e() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85719);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$b$f */
        public static final class C73017f extends AbstractC73011b {

            /* renamed from: a */
            public static final C73017f f163866a = new C73017f();

            private C73017f() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85720);
            }
        }

        public /* synthetic */ AbstractC73011b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$l */
    public static final class C73027l implements AbstractC88986z<C72902b> {

        /* renamed from: a */
        final /* synthetic */ C73009k f163881a;

        static {
            Covode.recordClassIndex(85730);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            ProgressDialogC72983g gVar = this.f163881a.f163849e;
            if (gVar != null) {
                gVar.dismiss();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73027l(C73009k kVar) {
            this.f163881a = kVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            if (th instanceof C14621d) {
                new C23144b(this.f163881a).mo37640e(R.string.dck).mo37637b();
            }
            ProgressDialogC72983g gVar = this.f163881a.f163849e;
            if (gVar != null) {
                gVar.dismiss();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
            C88411a a = this.f163881a.mo115430a();
            if (a != null) {
                a.mo142945a(bVar);
            }
            C73009k kVar = this.f163881a;
            Context context = kVar.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            C89219l.m154721d(context, "");
            kVar.f163849e = ProgressDialogC72983g.C72985b.m128886a(context, new ProgressDialogC72983g(context));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C72902b bVar) {
            C72902b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            ProgressDialogC72983g gVar = this.f163881a.f163849e;
            if (gVar != null) {
                gVar.dismiss();
            }
            if (bVar2.f163590a) {
                this.f163881a.mo115431a((AbstractC73011b) AbstractC73011b.C73014c.f163863a, false);
                new C23144b(this.f163881a).mo37635a(this.f163881a.getResources().getString(R.string.av1)).mo37637b();
                return;
            }
            this.f163881a.mo115431a((AbstractC73011b) AbstractC73011b.C73013b.f163862a, false);
            new C23144b(this.f163881a).mo37635a(this.f163881a.getResources().getString(R.string.av0)).mo37637b();
        }
    }

    /* renamed from: g */
    private final void m128924g() {
        if (this.f163851g) {
            m128919b();
        } else {
            m128921d();
        }
    }

    /* renamed from: a */
    public final C88411a mo115430a() {
        if (this.f163848d == null) {
            this.f163848d = new C88411a();
        }
        return this.f163848d;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f163860q;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        C88411a a = mo115430a();
        if (a != null) {
            a.dispose();
        }
        this.f163848d = null;
    }

    public C73009k() {
        Object a = CountDownStickerApi.C72884a.f163547a.mo28816a(Api.f79771d).mo28858a(CountDownStickerApi.class);
        C89219l.m154716b(a, "");
        this.f163857n = (CountDownStickerApi) a;
    }

    /* renamed from: c */
    private final void m128920c() {
        String str;
        long j;
        int i;
        MethodCollector.m26663i(7758);
        LinearLayout linearLayout = this.f163852i;
        if (linearLayout == null) {
            MethodCollector.m26664o(7758);
            return;
        }
        linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        CountDownStickerStruct countDownStickerStruct = this.f163845a;
        Long l = null;
        if (countDownStickerStruct != null) {
            str = countDownStickerStruct.getTitle();
        } else {
            str = null;
        }
        linearLayout.addView(m128917a(linearLayout, str, 22, 20.0f, R.color.bx));
        CountDownStickerStruct countDownStickerStruct2 = this.f163845a;
        if (countDownStickerStruct2 != null) {
            l = Long.valueOf(countDownStickerStruct2.getMillSecond());
        }
        linearLayout.addView(m128917a(linearLayout, m128918a(l), 41, 12.0f, R.color.c4));
        CountDownStickerStruct countDownStickerStruct3 = this.f163845a;
        if (countDownStickerStruct3 != null) {
            j = countDownStickerStruct3.getSubscribeNum();
        } else {
            j = 0;
        }
        String a = C53437b.m98615a(j);
        Resources resources = linearLayout.getResources();
        CountDownStickerStruct countDownStickerStruct4 = this.f163845a;
        if (countDownStickerStruct4 != null) {
            i = (int) countDownStickerStruct4.getSubscribeNum();
        } else {
            i = 0;
        }
        String quantityString = resources.getQuantityString(R.plurals.aj, i);
        C89219l.m154716b(quantityString, "");
        String a2 = C1764a.m5928a(quantityString, Arrays.copyOf(new Object[]{"<b>" + a + "</b>"}, 1));
        C89219l.m154716b(a2, "");
        a.length();
        TuxTextView a3 = m128917a(linearLayout, a2, 41, 32.0f, R.color.c4);
        this.f163847c = a3;
        linearLayout.addView(a3);
        String string = linearLayout.getResources().getString(R.string.auu);
        C89219l.m154716b(string, "");
        int c = C0643b.m2378c(linearLayout.getContext(), R.color.bx);
        Context context = linearLayout.getContext();
        if (context != null) {
            DmtButton a4 = m128916a(linearLayout, string, c, C0196a.m619b(context, R.drawable.qk));
            this.f163854k = a4;
            if (a4 != null) {
                a4.setOnClickListener(new View$OnClickListenerC73022g(this, linearLayout));
            }
            linearLayout.addView(this.f163854k);
            MethodCollector.m26664o(7758);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.content.Context");
        MethodCollector.m26664o(7758);
        throw nullPointerException;
    }

    /* renamed from: d */
    private final void m128921d() {
        String str;
        String str2;
        MethodCollector.m26663i(7760);
        LinearLayout linearLayout = this.f163852i;
        if (linearLayout == null) {
            MethodCollector.m26664o(7760);
            return;
        }
        linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        CountDownStickerStruct countDownStickerStruct = this.f163845a;
        Long l = null;
        if (countDownStickerStruct != null) {
            str = countDownStickerStruct.getTitle();
        } else {
            str = null;
        }
        linearLayout.addView(m128917a(linearLayout, str, 22, 20.0f, R.color.bx));
        StringBuilder sb = new StringBuilder();
        CountDownStickerStruct countDownStickerStruct2 = this.f163845a;
        if (countDownStickerStruct2 != null) {
            str2 = countDownStickerStruct2.getTextAlreadyExpired();
        } else {
            str2 = null;
        }
        StringBuilder append = sb.append(str2).append("\n");
        CountDownStickerStruct countDownStickerStruct3 = this.f163845a;
        if (countDownStickerStruct3 != null) {
            l = Long.valueOf(countDownStickerStruct3.getMillSecond());
        }
        linearLayout.addView(m128917a(linearLayout, append.append(m128918a(l)).toString(), 41, 12.0f, R.color.c4));
        String string = linearLayout.getResources().getString(R.string.auu);
        C89219l.m154716b(string, "");
        int c = C0643b.m2378c(linearLayout.getContext(), R.color.bx);
        Context context = linearLayout.getContext();
        if (context != null) {
            DmtButton a = m128916a(linearLayout, string, c, C0196a.m619b(context, R.drawable.qk));
            this.f163854k = a;
            if (a != null) {
                a.setOnClickListener(new View$OnClickListenerC73018c(this, linearLayout));
            }
            linearLayout.addView(this.f163854k);
            MethodCollector.m26664o(7760);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.content.Context");
        MethodCollector.m26664o(7760);
        throw nullPointerException;
    }

    /* renamed from: e */
    private final void m128922e() {
        String str;
        Long l;
        MethodCollector.m26663i(7900);
        LinearLayout linearLayout = this.f163852i;
        if (linearLayout == null) {
            MethodCollector.m26664o(7900);
            return;
        }
        linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        CountDownStickerStruct countDownStickerStruct = this.f163845a;
        String str2 = null;
        if (countDownStickerStruct != null) {
            str = countDownStickerStruct.getTitle();
        } else {
            str = null;
        }
        linearLayout.addView(m128917a(linearLayout, str, 22, 20.0f, R.color.bx));
        CountDownStickerStruct countDownStickerStruct2 = this.f163845a;
        if (countDownStickerStruct2 != null) {
            l = Long.valueOf(countDownStickerStruct2.getMillSecond());
        } else {
            l = null;
        }
        linearLayout.addView(m128917a(linearLayout, m128918a(l), 41, 12.0f, R.color.c4));
        CountDownStickerStruct countDownStickerStruct3 = this.f163845a;
        if (countDownStickerStruct3 != null) {
            str2 = countDownStickerStruct3.getTextTobeSubscribed();
        }
        linearLayout.addView(m128917a(linearLayout, str2, 41, 12.0f, R.color.c4));
        String string = linearLayout.getResources().getString(R.string.avh);
        C89219l.m154716b(string, "");
        int c = C0643b.m2378c(linearLayout.getContext(), R.color.a9);
        Context context = linearLayout.getContext();
        if (context != null) {
            DmtButton a = m128916a(linearLayout, string, c, C0196a.m619b(context, R.drawable.qj));
            this.f163855l = a;
            if (a != null) {
                a.setOnClickListener(new View$OnClickListenerC73019d(this, linearLayout));
            }
            linearLayout.addView(this.f163855l);
            MethodCollector.m26664o(7900);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.content.Context");
        MethodCollector.m26664o(7900);
        throw nullPointerException;
    }

    /* renamed from: f */
    private final void m128923f() {
        String str;
        Long l;
        MethodCollector.m26663i(7903);
        LinearLayout linearLayout = this.f163852i;
        if (linearLayout == null) {
            MethodCollector.m26664o(7903);
            return;
        }
        linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        CountDownStickerStruct countDownStickerStruct = this.f163845a;
        String str2 = null;
        if (countDownStickerStruct != null) {
            str = countDownStickerStruct.getTitle();
        } else {
            str = null;
        }
        linearLayout.addView(m128917a(linearLayout, str, 22, 20.0f, R.color.bx));
        CountDownStickerStruct countDownStickerStruct2 = this.f163845a;
        if (countDownStickerStruct2 != null) {
            l = Long.valueOf(countDownStickerStruct2.getMillSecond());
        } else {
            l = null;
        }
        linearLayout.addView(m128917a(linearLayout, m128918a(l), 41, 12.0f, R.color.c4));
        CountDownStickerStruct countDownStickerStruct3 = this.f163845a;
        if (countDownStickerStruct3 != null) {
            str2 = countDownStickerStruct3.getTextAlreadySubscribed();
        }
        linearLayout.addView(m128917a(linearLayout, str2, 41, 12.0f, R.color.c4));
        String string = linearLayout.getResources().getString(R.string.av2);
        C89219l.m154716b(string, "");
        int c = C0643b.m2378c(linearLayout.getContext(), R.color.c0);
        Context context = linearLayout.getContext();
        if (context != null) {
            DmtButton a = m128916a(linearLayout, string, c, C0196a.m619b(context, R.drawable.qk));
            this.f163855l = a;
            if (a != null) {
                a.setOnClickListener(new View$OnClickListenerC73020e(this, linearLayout));
            }
            linearLayout.addView(this.f163855l);
            MethodCollector.m26664o(7903);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.content.Context");
        MethodCollector.m26664o(7903);
        throw nullPointerException;
    }

    /* renamed from: b */
    private final void m128919b() {
        String str;
        String str2;
        long j;
        int i;
        MethodCollector.m26663i(7754);
        LinearLayout linearLayout = this.f163852i;
        if (linearLayout == null) {
            MethodCollector.m26664o(7754);
            return;
        }
        linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        CountDownStickerStruct countDownStickerStruct = this.f163845a;
        Long l = null;
        if (countDownStickerStruct != null) {
            str = countDownStickerStruct.getTitle();
        } else {
            str = null;
        }
        linearLayout.addView(m128917a(linearLayout, str, 22, 20.0f, R.color.bx));
        StringBuilder sb = new StringBuilder();
        CountDownStickerStruct countDownStickerStruct2 = this.f163845a;
        if (countDownStickerStruct2 != null) {
            str2 = countDownStickerStruct2.getTextAlreadyExpired();
        } else {
            str2 = null;
        }
        StringBuilder append = sb.append(str2).append("\n");
        CountDownStickerStruct countDownStickerStruct3 = this.f163845a;
        if (countDownStickerStruct3 != null) {
            l = Long.valueOf(countDownStickerStruct3.getMillSecond());
        }
        linearLayout.addView(m128917a(linearLayout, append.append(m128918a(l)).toString(), 41, 12.0f, R.color.c4));
        CountDownStickerStruct countDownStickerStruct4 = this.f163845a;
        if (countDownStickerStruct4 != null) {
            j = countDownStickerStruct4.getSubscribeNum();
        } else {
            j = 0;
        }
        String a = C53437b.m98615a(j);
        Resources resources = linearLayout.getResources();
        CountDownStickerStruct countDownStickerStruct5 = this.f163845a;
        if (countDownStickerStruct5 != null) {
            i = (int) countDownStickerStruct5.getSubscribeNum();
        } else {
            i = 0;
        }
        String quantityString = resources.getQuantityString(R.plurals.af, i);
        C89219l.m154716b(quantityString, "");
        String a2 = C1764a.m5928a(quantityString, Arrays.copyOf(new Object[]{"<b>" + a + "</b>"}, 1));
        C89219l.m154716b(a2, "");
        a.length();
        TuxTextView a3 = m128917a(linearLayout, a2, 41, 32.0f, R.color.c4);
        this.f163847c = a3;
        linearLayout.addView(a3);
        String string = linearLayout.getResources().getString(R.string.auu);
        C89219l.m154716b(string, "");
        int c = C0643b.m2378c(linearLayout.getContext(), R.color.bx);
        Context context = linearLayout.getContext();
        if (context != null) {
            DmtButton a4 = m128916a(linearLayout, string, c, C0196a.m619b(context, R.drawable.qk));
            this.f163854k = a4;
            if (a4 != null) {
                a4.setOnClickListener(new View$OnClickListenerC73021f(this, linearLayout));
            }
            linearLayout.addView(this.f163854k);
            MethodCollector.m26664o(7754);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.content.Context");
        MethodCollector.m26664o(7754);
        throw nullPointerException;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$j */
    public static final class C73025j implements AbstractC88986z<C72901a> {

        /* renamed from: a */
        final /* synthetic */ C73009k f163879a;

        static {
            Covode.recordClassIndex(85728);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73025j(C73009k kVar) {
            this.f163879a = kVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            if (th instanceof C14621d) {
                new C23144b(this.f163879a).mo37640e(R.string.dck).mo37637b();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
            C88411a a = this.f163879a.mo115430a();
            if (a != null) {
                a.mo142945a(bVar);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C72901a aVar) {
            int i;
            C72901a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (this.f163879a.isAdded()) {
                CountDownStickerStruct countDownStickerStruct = this.f163879a.f163845a;
                if (countDownStickerStruct != null) {
                    countDownStickerStruct.setSubscribeNum(aVar2.f163589a.getSubscribeNum());
                    countDownStickerStruct.setSubscribe(aVar2.f163589a.getSubscribe());
                }
                if (this.f163879a.f163851g) {
                    String a = C53437b.m98615a(aVar2.f163589a.getSubscribeNum());
                    Resources resources = this.f163879a.getResources();
                    if (System.currentTimeMillis() > aVar2.f163589a.getMillSecond()) {
                        i = R.plurals.af;
                    } else {
                        i = R.plurals.aj;
                    }
                    String quantityString = resources.getQuantityString(i, (int) aVar2.f163589a.getSubscribeNum());
                    C89219l.m154716b(quantityString, "");
                    String a2 = C1764a.m5928a(quantityString, Arrays.copyOf(new Object[]{"<b>" + a + "</b>"}, 1));
                    C89219l.m154716b(a2, "");
                    TextView textView = this.f163879a.f163847c;
                    if (textView != null) {
                        textView.setText(Html.fromHtml(a2));
                    }
                } else if (System.currentTimeMillis() > aVar2.f163589a.getMillSecond()) {
                    this.f163879a.mo115431a((AbstractC73011b) AbstractC73011b.C73012a.f163861a, false);
                } else if (C89219l.m154714a((Object) aVar2.f163589a.getSubscribe(), (Object) true)) {
                    this.f163879a.mo115431a((AbstractC73011b) AbstractC73011b.C73014c.f163863a, false);
                } else {
                    this.f163879a.mo115431a((AbstractC73011b) AbstractC73011b.C73013b.f163862a, false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$c */
    public static final class View$OnClickListenerC73018c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73009k f163867a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout f163868b;

        static {
            Covode.recordClassIndex(85721);
        }

        View$OnClickListenerC73018c(C73009k kVar, LinearLayout linearLayout) {
            this.f163867a = kVar;
            this.f163868b = linearLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163867a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$f */
    public static final class View$OnClickListenerC73021f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73009k f163873a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout f163874b;

        static {
            Covode.recordClassIndex(85724);
        }

        View$OnClickListenerC73021f(C73009k kVar, LinearLayout linearLayout) {
            this.f163873a = kVar;
            this.f163874b = linearLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163873a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$g */
    public static final class View$OnClickListenerC73022g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73009k f163875a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout f163876b;

        static {
            Covode.recordClassIndex(85725);
        }

        View$OnClickListenerC73022g(C73009k kVar, LinearLayout linearLayout) {
            this.f163875a = kVar;
            this.f163876b = linearLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163875a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$k */
    static final class View$OnClickListenerC73026k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73009k f163880a;

        static {
            Covode.recordClassIndex(85729);
        }

        View$OnClickListenerC73026k(C73009k kVar) {
            this.f163880a = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163880a.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AbstractC81915c.m141874a(new C33489d(false, false));
    }

    /* renamed from: a */
    private final String m128918a(Long l) {
        if (l == null) {
            return "";
        }
        String formatDateTime = DateUtils.formatDateTime(getContext(), l.longValue(), 87);
        C89219l.m154716b(formatDateTime, "");
        return formatDateTime;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$e */
    public static final class View$OnClickListenerC73020e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73009k f163871a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout f163872b;

        static {
            Covode.recordClassIndex(85723);
        }

        View$OnClickListenerC73020e(C73009k kVar, LinearLayout linearLayout) {
            this.f163871a = kVar;
            this.f163872b = linearLayout;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C73009k kVar = this.f163871a;
            Aweme aweme = kVar.f163846b;
            Long l = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            CountDownStickerStruct countDownStickerStruct = this.f163871a.f163845a;
            if (countDownStickerStruct != null) {
                l = Long.valueOf(countDownStickerStruct.getMillSecond());
            }
            kVar.mo115432a(str, l);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$d */
    public static final class View$OnClickListenerC73019d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73009k f163869a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout f163870b;

        static {
            Covode.recordClassIndex(85722);
        }

        View$OnClickListenerC73019d(C73009k kVar, LinearLayout linearLayout) {
            this.f163869a = kVar;
            this.f163870b = linearLayout;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C73009k kVar = this.f163869a;
            if (!C80428fg.m139432a(kVar.getContext())) {
                C17197a.C17200a aVar = new C17197a.C17200a(kVar.getContext());
                aVar.mo27189a(R.string.foq);
                aVar.mo27194b(R.string.fot);
                aVar.mo27190a(R.string.fjb, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73023h(kVar), false);
                aVar.mo27195b(R.string.fja, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73024i(kVar), false);
                aVar.mo27193a().mo27185c();
                C33744d dVar = new C33744d();
                String str2 = kVar.f163850f;
                if (str2 == null) {
                    C89219l.m154710a("enterFrom");
                }
                C39162r.m79460a("push_pre_permission_show", dVar.mo59983a("enter_from", str2).mo59983a("enter_method", "live_cd_sticker").mo59983a("enter_reason", "general").f79943a);
                return;
            }
            C73009k kVar2 = this.f163869a;
            Aweme aweme = kVar2.f163846b;
            Long l = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            CountDownStickerStruct countDownStickerStruct = this.f163869a.f163845a;
            if (countDownStickerStruct != null) {
                l = Long.valueOf(countDownStickerStruct.getMillSecond());
            }
            kVar2.mo115432a(str, l);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        Serializable serializable;
        String str5;
        AbstractC73011b bVar;
        Serializable serializable2;
        super.onCreate(bundle);
        setStyle(0, R.style.z0);
        Boolean bool = null;
        if (this.f163846b == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable2 = arguments.getSerializable("countdown_sticker_aweme");
            } else {
                serializable2 = null;
            }
            if (!(serializable2 instanceof Aweme)) {
                serializable2 = null;
            }
            this.f163846b = (Aweme) serializable2;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("group_id")) == null) {
            str = "";
        }
        this.f163858o = str;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str2 = arguments3.getString("author_id")) == null) {
            str2 = "";
        }
        this.f163859p = str2;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str3 = arguments4.getString("enter_from")) == null) {
            str3 = "";
        }
        this.f163850f = str3;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        Aweme aweme = this.f163846b;
        if (aweme != null) {
            str4 = aweme.getAuthorUid();
        } else {
            str4 = null;
        }
        this.f163851g = TextUtils.equals(curUserId, str4);
        if (this.f163845a == null) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                serializable = arguments5.getSerializable("countdown_sticker_data");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof CountDownStickerStruct)) {
                serializable = null;
            }
            this.f163845a = (CountDownStickerStruct) serializable;
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            String curUserId2 = g2.getCurUserId();
            Aweme aweme2 = this.f163846b;
            if (aweme2 != null) {
                str5 = aweme2.getAuthorUid();
            } else {
                str5 = null;
            }
            long j = 0;
            if (TextUtils.equals(curUserId2, str5)) {
                long currentTimeMillis = System.currentTimeMillis();
                CountDownStickerStruct countDownStickerStruct = this.f163845a;
                if (countDownStickerStruct != null) {
                    j = countDownStickerStruct.getMillSecond();
                }
                if (currentTimeMillis > j) {
                    bVar = AbstractC73011b.C73015d.f163864a;
                } else {
                    bVar = AbstractC73011b.C73016e.f163865a;
                }
            } else {
                long currentTimeMillis2 = System.currentTimeMillis();
                CountDownStickerStruct countDownStickerStruct2 = this.f163845a;
                if (countDownStickerStruct2 != null) {
                    j = countDownStickerStruct2.getMillSecond();
                }
                if (currentTimeMillis2 > j) {
                    bVar = AbstractC73011b.C73012a.f163861a;
                } else {
                    CountDownStickerStruct countDownStickerStruct3 = this.f163845a;
                    if (countDownStickerStruct3 != null) {
                        bool = countDownStickerStruct3.getSubscribe();
                    }
                    if (C89219l.m154714a((Object) bool, (Object) true)) {
                        bVar = AbstractC73011b.C73014c.f163863a;
                    } else {
                        bVar = AbstractC73011b.C73013b.f163862a;
                    }
                }
            }
            this.f163856m = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$i */
    static final class DialogInterface$OnClickListenerC73024i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73009k f163878a;

        static {
            Covode.recordClassIndex(85727);
        }

        DialogInterface$OnClickListenerC73024i(C73009k kVar) {
            this.f163878a = kVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C73009k kVar = this.f163878a;
            C33744d dVar = new C33744d();
            String str = kVar.f163850f;
            if (str == null) {
                C89219l.m154710a("enterFrom");
            }
            C39162r.m79460a("push_pre_permission_deny", dVar.mo59983a("enter_from", str).mo59983a("enter_method", "live_cd_sticker").mo59983a("enter_reason", "general").f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$h */
    static final class DialogInterface$OnClickListenerC73023h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73009k f163877a;

        static {
            Covode.recordClassIndex(85726);
        }

        DialogInterface$OnClickListenerC73023h(C73009k kVar) {
            this.f163877a = kVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C73009k kVar = this.f163877a;
            C33744d dVar = new C33744d();
            String str = kVar.f163850f;
            if (str == null) {
                C89219l.m154710a("enterFrom");
            }
            C39162r.m79460a("push_pre_permission_auth", dVar.mo59983a("enter_from", str).mo59983a("enter_method", "live_cd_sticker").mo59983a("enter_reason", "general").f79943a);
            try {
                C80428fg.m139435c(this.f163877a.getContext());
            } catch (Exception unused) {
                Context context = this.f163877a.getContext();
                if (context != null) {
                    Intent intent = new Intent("android.settings.SETTINGS");
                    C84349a.m145093a(intent, context);
                    context.startActivity(intent);
                }
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void showNow(AbstractC0952i iVar, String str) {
        long j;
        String aid;
        super.showNow(iVar, str);
        AbstractC81915c.m141874a(new C33489d(true, false));
        long currentTimeMillis = System.currentTimeMillis();
        CountDownStickerStruct countDownStickerStruct = this.f163845a;
        if (countDownStickerStruct != null) {
            j = countDownStickerStruct.getMillSecond();
        } else {
            j = 0;
        }
        if (currentTimeMillis > j) {
            mo115431a((AbstractC73011b) AbstractC73011b.C73017f.f163866a, false);
        }
        Aweme aweme = this.f163846b;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            this.f163857n.getDetail(aid).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C73025j(this));
        }
    }

    /* renamed from: a */
    public final void mo115431a(AbstractC73011b bVar, boolean z) {
        C89219l.m154721d(bVar, "");
        if (!C89219l.m154714a(this.f163856m, bVar) || z) {
            this.f163856m = bVar;
            if (C89219l.m154714a(bVar, AbstractC73011b.C73012a.f163861a)) {
                m128921d();
            } else if (C89219l.m154714a(bVar, AbstractC73011b.C73013b.f163862a)) {
                m128922e();
            } else if (C89219l.m154714a(bVar, AbstractC73011b.C73014c.f163863a)) {
                m128923f();
            } else if (C89219l.m154714a(bVar, AbstractC73011b.C73015d.f163864a)) {
                m128919b();
            } else if (C89219l.m154714a(bVar, AbstractC73011b.C73016e.f163865a)) {
                m128920c();
            } else if (C89219l.m154714a(bVar, AbstractC73011b.C73017f.f163866a)) {
                m128924g();
            }
        }
    }

    /* renamed from: a */
    public final void mo115432a(String str, Long l) {
        long j;
        int ordinal;
        if (!TextUtils.isEmpty(str)) {
            if (C89219l.m154714a(this.f163856m, AbstractC73011b.C73013b.f163862a)) {
                C33744d dVar = new C33744d();
                String str2 = this.f163858o;
                if (str2 == null) {
                    C89219l.m154710a("groupId");
                }
                C33744d a = dVar.mo59983a("group_id", str2);
                String str3 = this.f163859p;
                if (str3 == null) {
                    C89219l.m154710a("authorId");
                }
                C33744d a2 = a.mo59983a("author_id", str3);
                String str4 = this.f163850f;
                if (str4 == null) {
                    C89219l.m154710a("enterFrom");
                }
                C39162r.m79460a("livesdk_live_subscirbe", a2.mo59983a("enter_from", str4).mo59981a("countdown_time", C72975f.C72976a.m128882a(this.f163845a)).mo59983a("enter_method", "live_cd_sticker").f79943a);
            } else if (C89219l.m154714a(this.f163856m, AbstractC73011b.C73014c.f163863a)) {
                C33744d dVar2 = new C33744d();
                String str5 = this.f163858o;
                if (str5 == null) {
                    C89219l.m154710a("groupId");
                }
                C33744d a3 = dVar2.mo59983a("group_id", str5);
                String str6 = this.f163859p;
                if (str6 == null) {
                    C89219l.m154710a("authorId");
                }
                C33744d a4 = a3.mo59983a("author_id", str6);
                String str7 = this.f163850f;
                if (str7 == null) {
                    C89219l.m154710a("enterFrom");
                }
                C39162r.m79460a("livesdk_live_unsubscirbe", a4.mo59983a("enter_from", str7).mo59981a("countdown_time", C72975f.C72976a.m128882a(this.f163845a)).mo59983a("enter_method", "live_cd_sticker").f79943a);
            }
            CountDownStickerApi countDownStickerApi = this.f163857n;
            if (str == null) {
                str = "";
            }
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            long j2 = j / 1000;
            if (C89219l.m154714a(this.f163856m, AbstractC73011b.C73013b.f163862a)) {
                ordinal = EnumC72887a.Subscribe.ordinal();
            } else {
                ordinal = EnumC72887a.CancelSubscribe.ordinal();
            }
            countDownStickerApi.subscribe(str, j2, ordinal).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C73027l(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageView imageView;
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a0s, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) a;
        this.f163852i = linearLayout;
        if (linearLayout != null) {
            imageView = (ImageView) linearLayout.findViewById(R.id.a6q);
        } else {
            imageView = null;
        }
        this.f163853j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC73026k(this));
        }
        mo115431a(this.f163856m, true);
        return this.f163852i;
    }

    /* renamed from: a */
    private static DmtButton m128916a(LinearLayout linearLayout, String str, int i, Drawable drawable) {
        DmtButton dmtButton = new DmtButton(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        dmtButton.setText(str);
        dmtButton.setTextColor(i);
        dmtButton.setBackground(drawable);
        dmtButton.setTextSize(15.0f);
        if (Build.VERSION.SDK_INT >= 21) {
            dmtButton.setStateListAnimator(null);
        }
        Context context = linearLayout.getContext();
        if (context != null) {
            layoutParams.topMargin = (int) C84912r.m145930a(context, 36.0f);
            layoutParams.bottomMargin = (int) C84912r.m145930a(context, 46.0f);
            layoutParams.leftMargin = (int) C84912r.m145930a(context, 16.0f);
            layoutParams.rightMargin = (int) C84912r.m145930a(context, 16.0f);
            dmtButton.setLayoutParams(layoutParams);
        }
        return dmtButton;
    }

    /* renamed from: a */
    private static TuxTextView m128917a(LinearLayout linearLayout, String str, int i, float f, int i2) {
        Context context = linearLayout.getContext();
        C89219l.m154716b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        tuxTextView.setText(Html.fromHtml(str));
        Context context2 = linearLayout.getContext();
        C89219l.m154716b(context2, "");
        tuxTextView.setTextColor(context2.getResources().getColor(i2));
        tuxTextView.setTuxFont(i);
        Context context3 = linearLayout.getContext();
        if (context3 != null) {
            layoutParams.topMargin = (int) C84912r.m145930a(context3, f);
            layoutParams.bottomMargin = (int) C84912r.m145930a(context3, 0.0f);
            int i3 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart((int) C84912r.m145930a(context3, 24.0f));
            layoutParams.setMarginEnd((int) C84912r.m145930a(context3, 24.0f));
            tuxTextView.setLayoutParams(layoutParams);
        }
        tuxTextView.setGravity(17);
        return tuxTextView;
    }
}
