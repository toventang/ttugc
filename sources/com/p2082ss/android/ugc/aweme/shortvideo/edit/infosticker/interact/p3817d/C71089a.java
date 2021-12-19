package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3817d;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.C45890g;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.C45842m;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65353aw;
import com.p2082ss.android.ugc.aweme.property.C65411cu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.EditPageQaStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.permission.C82949a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.a */
public final class C71089a extends C45842m {

    /* renamed from: r */
    public static final C71090a f159209r = new C71090a((byte) 0);

    /* renamed from: o */
    public EditTextStickerViewModel f159210o;

    /* renamed from: p */
    public EditPageQaStickerViewModel f159211p;

    /* renamed from: q */
    public boolean f159212q;

    /* renamed from: s */
    private final boolean f159213s = C82949a.f185358a;

    /* renamed from: t */
    private EditCommentStickerViewModel f159214t;

    static {
        Covode.recordClassIndex(83588);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.a$a */
    public static final class C71090a {
        static {
            Covode.recordClassIndex(83589);
        }

        private C71090a() {
        }

        public /* synthetic */ C71090a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m125651a(String str) {
            C89219l.m154721d(str, "");
            if (str.length() > 150) {
                return false;
            }
            List<String> a = C65411cu.m117126a();
            if (a == null || a.isEmpty()) {
                a = C89070n.m154522b("^why .*", "^what .*", "^when .*", "^where .*", "^who .*", "^how .*", ".*could you .*", ".*can you .*", ".*would you .*");
            }
            Iterator<T> it = a.iterator();
            while (it.hasNext()) {
                Locale locale = Locale.US;
                C89219l.m154716b(locale, "");
                String lowerCase = str.toLowerCase(locale);
                C89219l.m154716b(lowerCase, "");
                if (Pattern.matches(it.next(), lowerCase)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b, com.p2082ss.android.ugc.aweme.editSticker.p2877a.C45842m
    /* renamed from: c */
    public final View mo77177c() {
        int i;
        MethodCollector.m26663i(12010);
        View c = super.mo77177c();
        if (c != null) {
            LinearLayout linearLayout = (LinearLayout) c;
            boolean z = this.f159212q;
            EditPageQaStickerViewModel editPageQaStickerViewModel = this.f159211p;
            if (editPageQaStickerViewModel == null) {
                C89219l.m154710a("qaStickerViewModel");
            }
            boolean b = editPageQaStickerViewModel.mo128053k().mo128071d().mo112283b();
            if (C65353aw.m117038a()) {
                View view = this.f106785h;
                if (view != null) {
                    String text = ((C46239q) view).getText();
                    C89219l.m154716b(text, "");
                    if (C71090a.m125651a(text) && !C45890g.m88534a().f106866f && this.f159213s && C63244g.m114602a().mo73255A().mo93903b() && !z && !b) {
                        EditPageQaStickerViewModel editPageQaStickerViewModel2 = this.f159211p;
                        if (editPageQaStickerViewModel2 == null) {
                            C89219l.m154710a("qaStickerViewModel");
                        }
                        VideoPublishEditModel videoPublishEditModel = editPageQaStickerViewModel2.f185407b.f148412b;
                        if (videoPublishEditModel != null) {
                            C39162r.m79460a("text_to_question_show", new C33744d().mo59983a("enter_from", "video_edit_page").mo59983a("creation_id", videoPublishEditModel.creationId).mo59983a("shoot_way", C63244g.m114602a().mo73255A().mo93904c()).f79943a);
                        }
                        if (C80471gb.m139482a()) {
                            i = 2131230969;
                        } else {
                            i = 2131230968;
                        }
                        LinearLayout a = mo77171a(i, R.string.f0d);
                        a.setOnClickListener(new View$OnClickListenerC71091b(this, z));
                        if (linearLayout.getChildCount() == 0) {
                            linearLayout.addView(a);
                        } else {
                            linearLayout.addView(a, linearLayout.getChildCount() - 1);
                            linearLayout.addView(mo77179e(), linearLayout.getChildCount() - 1);
                        }
                    }
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.view.TextStickerView");
                    MethodCollector.m26664o(12010);
                    throw nullPointerException;
                }
            }
            mo77173a(this.f106784g + 1);
            MethodCollector.m26664o(12010);
            return linearLayout;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        MethodCollector.m26664o(12010);
        throw nullPointerException2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EditPageQaStickerViewModel m125649a(C71089a aVar) {
        EditPageQaStickerViewModel editPageQaStickerViewModel = aVar.f159211p;
        if (editPageQaStickerViewModel == null) {
            C89219l.m154710a("qaStickerViewModel");
        }
        return editPageQaStickerViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.a$c */
    static final class C71092c extends AbstractC89220m implements AbstractC89172b<C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71089a f159217a;

        static {
            Covode.recordClassIndex(83591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71092c(C71089a aVar) {
            super(1);
            this.f159217a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20521k kVar) {
            boolean z;
            Boolean bool;
            C20521k kVar2 = kVar;
            C71089a aVar = this.f159217a;
            if (kVar2 == null || (bool = (Boolean) kVar2.mo33723a()) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            aVar.f159212q = z;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.a$b */
    static final class View$OnClickListenerC71091b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C71089a f159215a;

        /* renamed from: b */
        final /* synthetic */ boolean f159216b;

        static {
            Covode.recordClassIndex(83590);
        }

        View$OnClickListenerC71091b(C71089a aVar, boolean z) {
            this.f159215a = aVar;
            this.f159216b = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
            if (r11 == null) goto L_0x0077;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r19) {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3817d.C71089a.View$OnClickListenerC71091b.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71089a(View view, AbstractC45840k kVar) {
        super(view, kVar);
        C89219l.m154721d(view, "");
        Context context = this.f106782e;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) context).mo33800a(EditTextStickerViewModel.class);
        C89219l.m154716b(a, "");
        this.f159210o = (EditTextStickerViewModel) a;
        Context context2 = this.f106782e;
        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) context2).mo33800a(EditPageQaStickerViewModel.class);
        C89219l.m154716b(a2, "");
        this.f159211p = (EditPageQaStickerViewModel) a2;
        JediViewModel a3 = C20531t.m38716a((ActivityC0945e) this.f106782e).mo33800a(EditCommentStickerViewModel.class);
        C89219l.m154716b(a3, "");
        EditCommentStickerViewModel editCommentStickerViewModel = (EditCommentStickerViewModel) a3;
        this.f159214t = editCommentStickerViewModel;
        if (editCommentStickerViewModel == null) {
            C89219l.m154710a("commentStickerViewModel");
        }
        AbstractC88412b unused = editCommentStickerViewModel.m38548b((AbstractC1204m) this.f106782e, C71093b.f159218a, new C20370ah(), new C71092c(this));
    }
}
