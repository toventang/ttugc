package com.p2082ss.android.ugc.aweme.commentStickerPanel.itemview;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;
import com.p2082ss.android.ugc.aweme.p4244z.AbstractC81786b;
import com.p2082ss.android.ugc.aweme.p4244z.AbstractC81787c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.servicimpl.EmojiServiceImplDiff;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.AbstractC72865b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.C72864a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73990bi;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.view.widget.CircleImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView */
public class CommentStickerView extends LinearLayout implements AbstractC45904h<C72864a> {

    /* renamed from: c */
    public static final C37391a f88232c = new C37391a((byte) 0);

    /* renamed from: a */
    public View f88233a;

    /* renamed from: b */
    public AbstractC81787c f88234b;

    /* renamed from: d */
    private CommentVideoModel f88235d;

    /* renamed from: e */
    private AbstractC72865b f88236e;

    /* renamed from: f */
    private String f88237f;

    /* renamed from: g */
    private long f88238g;

    /* renamed from: h */
    private boolean f88239h = true;

    /* renamed from: i */
    private long f88240i;

    /* renamed from: j */
    private SafeHandler f88241j;

    /* renamed from: k */
    private View f88242k;

    /* renamed from: l */
    private AbstractC81786b f88243l;

    /* renamed from: m */
    private final AbstractC89244h f88244m = C89250i.m154773a((AbstractC89171a) new C37392b(this));

    /* renamed from: n */
    private final AbstractC89244h f88245n = C89250i.m154773a((AbstractC89171a) new C37394d(this));

    /* renamed from: o */
    private final AbstractC89244h f88246o = C89250i.m154773a((AbstractC89171a) new C37395e(this));

    /* renamed from: p */
    private final AbstractC89244h f88247p = C89250i.m154773a((AbstractC89171a) new C37398h(this));

    /* renamed from: q */
    private boolean f88248q;

    static {
        Covode.recordClassIndex(44771);
    }

    private final CircleImageView getAvatarView() {
        return (CircleImageView) this.f88244m.getValue();
    }

    private final TuxTextView getCommentTextView() {
        return (TuxTextView) this.f88245n.getValue();
    }

    private final LinearLayout getTextLayout() {
        return (LinearLayout) this.f88247p.getValue();
    }

    /* access modifiers changed from: protected */
    public int getMLayoutId() {
        return R.layout.ng;
    }

    /* access modifiers changed from: protected */
    public int getMReplyTextId() {
        return R.string.fa8;
    }

    /* access modifiers changed from: protected */
    public final TuxTextView getReplyTextView() {
        return (TuxTextView) this.f88246o.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView$a */
    public static final class C37391a {
        static {
            Covode.recordClassIndex(44772);
        }

        private C37391a() {
        }

        public /* synthetic */ C37391a(byte b) {
            this();
        }
    }

    public final CommentVideoModel getData() {
        return this.f88235d;
    }

    /* access modifiers changed from: protected */
    public final View getMHintIcon() {
        return this.f88242k;
    }

    /* access modifiers changed from: protected */
    public final String getMUserName() {
        return this.f88237f;
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView$f */
    static final class RunnableC37396f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommentStickerView f88253a;

        static {
            Covode.recordClassIndex(44777);
        }

        RunnableC37396f(CommentStickerView commentStickerView) {
            this.f88253a = commentStickerView;
        }

        public final void run() {
            this.f88253a.mo65023e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView$b */
    static final class C37392b extends AbstractC89220m implements AbstractC89171a<CircleImageView> {

        /* renamed from: a */
        final /* synthetic */ CommentStickerView f88249a;

        static {
            Covode.recordClassIndex(44773);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37392b(CommentStickerView commentStickerView) {
            super(0);
            this.f88249a = commentStickerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CircleImageView invoke() {
            return CommentStickerView.m75436a(this.f88249a).findViewById(R.id.a93);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView$d */
    static final class C37394d extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ CommentStickerView f88251a;

        static {
            Covode.recordClassIndex(44775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37394d(CommentStickerView commentStickerView) {
            super(0);
            this.f88251a = commentStickerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return CommentStickerView.m75436a(this.f88251a).findViewById(R.id.a_f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView$e */
    static final class C37395e extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ CommentStickerView f88252a;

        static {
            Covode.recordClassIndex(44776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37395e(CommentStickerView commentStickerView) {
            super(0);
            this.f88252a = commentStickerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return CommentStickerView.m75436a(this.f88252a).findViewById(R.id.a_n);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView$h */
    static final class C37398h extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ CommentStickerView f88255a;

        static {
            Covode.recordClassIndex(44779);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37398h(CommentStickerView commentStickerView) {
            super(0);
            this.f88255a = commentStickerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return CommentStickerView.m75436a(this.f88255a).findViewById(R.id.ege);
        }
    }

    /* renamed from: f */
    private final void m75438f() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC37397g(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView$c */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC37393c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ CommentStickerView f88250a;

        static {
            Covode.recordClassIndex(44774);
        }

        public final void onGlobalLayout() {
            if (CommentStickerView.m75436a(this.f88250a).getWidth() > 0) {
                this.f88250a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f88250a.mo65015a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC37393c(CommentStickerView commentStickerView) {
            this.f88250a = commentStickerView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView$g */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC37397g implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ CommentStickerView f88254a;

        static {
            Covode.recordClassIndex(44778);
        }

        public final void onGlobalLayout() {
            this.f88254a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f88254a.setVisibility(0);
            AbstractC81787c cVar = this.f88254a.f88234b;
            if (cVar != null) {
                cVar.mo112289a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC37397g(CommentStickerView commentStickerView) {
            this.f88254a = commentStickerView;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: d */
    public final int mo65022d() {
        if (getData() == null) {
            return 0;
        }
        CommentVideoModel data = getData();
        if (data == null) {
            C89219l.m154715b();
        }
        if (!data.hasTimeData()) {
            return 0;
        }
        CommentVideoModel data2 = getData();
        if (data2 == null) {
            C89219l.m154715b();
        }
        return data2.getStartTime();
    }

    /* renamed from: e */
    public final boolean mo65023e() {
        boolean z;
        int i = 0;
        if (this.f88235d != null) {
            AbstractC81786b bVar = this.f88243l;
            if (bVar == null) {
                C89219l.m154710a("controller");
            }
            if (!bVar.mo125491a() && !this.f88248q) {
                CommentVideoModel commentVideoModel = this.f88235d;
                if (commentVideoModel == null) {
                    C89219l.m154715b();
                }
                boolean isVisibleWhen = commentVideoModel.isVisibleWhen(this.f88238g);
                if (!isVisibleWhen || 8 != getVisibility()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!isVisibleWhen) {
                    i = 8;
                }
                C71827ew.m126829b(this, i);
                this.f88239h = isVisibleWhen;
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo65015a() {
        int width = getTextLayout().getWidth();
        View view = this.f88233a;
        if (view == null) {
            C89219l.m154710a("root");
        }
        int width2 = view.getWidth() - getTextLayout().getWidth();
        if (getCommentTextView().getWidth() >= width || getReplyTextView().getWidth() >= width) {
            if (getCommentTextView().getLineCount() <= 6) {
                m75437a(15.0f, 18.0f);
            } else if (getCommentTextView().getLineCount() <= 9) {
                m75437a(13.0f, 15.0f);
            } else {
                m75437a(11.0f, 12.0f);
            }
            getCommentTextView().setMaxLines(8);
            m75438f();
            return;
        }
        getLayoutParams().width = width2 + Math.max(getCommentTextView().getWidth(), getReplyTextView().getWidth());
        requestLayout();
        m75438f();
    }

    /* renamed from: b */
    public final C72864a mo65021c() {
        CommentVideoModel commentVideoModel;
        InteractStickerStruct interactStickerStruct;
        InteractStickerStruct c;
        if (this.f88235d == null) {
            this.f88235d = new CommentVideoModel(null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, 65535, null);
        }
        CommentVideoModel commentVideoModel2 = this.f88235d;
        if (commentVideoModel2 == null) {
            commentVideoModel = new CommentVideoModel(null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, 65535, null);
        } else {
            commentVideoModel = new CommentVideoModel(null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, 65535, null);
            commentVideoModel.setStartTime(commentVideoModel2.getStartTime());
            commentVideoModel.setEndTime(commentVideoModel2.getEndTime());
        }
        AbstractC72865b bVar = this.f88236e;
        if (bVar == null || (c = bVar.mo112284c()) == null) {
            interactStickerStruct = new InteractStickerStruct();
        } else {
            interactStickerStruct = new InteractStickerStruct();
            interactStickerStruct.setType(c.getType());
            interactStickerStruct.setIndex(c.getIndex());
            interactStickerStruct.setAttr(c.getAttr());
            interactStickerStruct.setTrackList(c.getTrackList());
        }
        return new C72864a(commentVideoModel, interactStickerStruct);
    }

    public final void setEnableEdit(boolean z) {
        this.f88239h = z;
    }

    /* access modifiers changed from: protected */
    public final void setMHintIcon(View view) {
        this.f88242k = view;
    }

    /* access modifiers changed from: protected */
    public final void setMUserName(String str) {
        this.f88237f = str;
    }

    public final void setPlayPosition(long j) {
        this.f88238g = j;
    }

    public final void setController(AbstractC81786b bVar) {
        C89219l.m154721d(bVar, "");
        this.f88243l = bVar;
    }

    public final void setDumpData(AbstractC72865b bVar) {
        C89219l.m154721d(bVar, "");
        this.f88236e = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ View m75436a(CommentStickerView commentStickerView) {
        View view = commentStickerView.f88233a;
        if (view == null) {
            C89219l.m154710a("root");
        }
        return view;
    }

    private final void setAvatarImage(UrlModel urlModel) {
        if (urlModel != null) {
            C84402a.m145169a(getAvatarView(), urlModel, -1, -1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45897c
    public void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        setAlpha(f);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: b */
    public final int mo65018b(int i) {
        if (getData() == null) {
            return i;
        }
        CommentVideoModel data = getData();
        if (data == null) {
            C89219l.m154715b();
        }
        if (!data.hasTimeData()) {
            return i;
        }
        CommentVideoModel data2 = getData();
        if (data2 == null) {
            C89219l.m154715b();
        }
        return data2.getEndTime();
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: c */
    public final int mo65020c(int i) {
        if (getData() == null) {
            return i;
        }
        CommentVideoModel data = getData();
        if (data == null) {
            C89219l.m154715b();
        }
        if (!data.hasTimeData()) {
            return i;
        }
        CommentVideoModel data2 = getData();
        if (data2 == null) {
            C89219l.m154715b();
        }
        return data2.getEndTime();
    }

    public final void setTouching(boolean z) {
        if (z != this.f88248q) {
            this.f88248q = z;
            if (!z) {
                this.f88240i = SystemClock.elapsedRealtime();
                SafeHandler safeHandler = this.f88241j;
                if (safeHandler == null) {
                    C89219l.m154710a("handler");
                }
                safeHandler.postDelayed(new RunnableC37396f(this), 1000);
            }
        }
    }

    private final void setCommentMsg(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (C80471gb.m139483a(getContext())) {
                getCommentTextView().setGravity(5);
            }
            getCommentTextView().setText(str);
            EmojiServiceImplDiff.m120143a().mo101499a(getCommentTextView());
            C73991bj.m130128a(" commentMsg: " + str + "  commentTextView： " + getCommentTextView().getText() + ' ' + " color: " + getCommentTextView().getCurrentTextColor() + "  setColor: " + C0643b.m2378c(getContext(), R.color.bx));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: a */
    public final int mo65014a(int i) {
        if (getData() == null) {
            return i;
        }
        CommentVideoModel data = getData();
        if (data == null) {
            C89219l.m154715b();
        }
        if (!data.hasTimeData()) {
            return i;
        }
        CommentVideoModel data2 = getData();
        if (data2 == null) {
            C89219l.m154715b();
        }
        return data2.getStartTime();
    }

    /* renamed from: a */
    private final void m75437a(float f, float f2) {
        getCommentTextView().setTextSize(0, C30745b.m63132b(getContext(), f));
        C73990bi.m130127a(getCommentTextView(), (int) C30745b.m63132b(getContext(), f2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentStickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5464);
        C89219l.m154721d(context, "");
        View a = C1764a.m5927a(LayoutInflater.from(context), getMLayoutId(), this, true);
        C89219l.m154716b(a, "");
        this.f88233a = a;
        setOrientation(0);
        setVisibility(4);
        Activity a2 = C67279a.m119194a(context);
        if (a2 != null) {
            this.f88241j = new SafeHandler((ActivityC0218d) a2);
            MethodCollector.m26664o(5464);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        MethodCollector.m26664o(5464);
        throw nullPointerException;
    }

    /* renamed from: a */
    public final void mo65016a(CommentVideoModel commentVideoModel, AbstractC81787c cVar) {
        UrlModel urlModel;
        String str;
        this.f88235d = commentVideoModel;
        this.f88234b = cVar;
        String str2 = null;
        if (commentVideoModel != null) {
            urlModel = commentVideoModel.getUserAvatar();
        } else {
            urlModel = null;
        }
        setAvatarImage(urlModel);
        CommentVideoModel commentVideoModel2 = this.f88235d;
        if (commentVideoModel2 != null) {
            str = commentVideoModel2.getCommentMsg();
        } else {
            str = null;
        }
        setCommentMsg(str);
        CommentVideoModel commentVideoModel3 = this.f88235d;
        if (commentVideoModel3 != null) {
            str2 = commentVideoModel3.getUserName();
        }
        this.f88237f = str2;
        if (!TextUtils.isEmpty(str2)) {
            TuxTextView replyTextView = getReplyTextView();
            Context context = getContext();
            C89219l.m154716b(context, "");
            replyTextView.setText(context.getResources().getString(getMReplyTextId(), this.f88237f));
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC37393c(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.sticker.data.e, int, int] */
    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: a */
    public final /* synthetic */ void mo65017a(C72864a aVar, int i, int i2) {
        InteractStickerStruct interactStickerStruct;
        int i3;
        int i4;
        C72864a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        CommentVideoModel commentVideoModel = this.f88235d;
        if (commentVideoModel != null) {
            CommentVideoModel commentVideoModel2 = aVar2.f163494a;
            if (commentVideoModel2 != null) {
                i4 = commentVideoModel2.getStartTime();
            } else {
                i4 = 0;
            }
            commentVideoModel.setStartTime(i4);
        }
        CommentVideoModel commentVideoModel3 = this.f88235d;
        if (commentVideoModel3 != null) {
            CommentVideoModel commentVideoModel4 = aVar2.f163494a;
            if (commentVideoModel4 != null) {
                i3 = commentVideoModel4.getEndTime();
            } else {
                i3 = 0;
            }
            commentVideoModel3.setEndTime(i3);
        }
        NormalTrackTimeStamp a = C71073b.m125560a(aVar2.f163495b);
        AbstractC72865b bVar = this.f88236e;
        if (bVar != null) {
            interactStickerStruct = bVar.mo112284c();
        } else {
            interactStickerStruct = null;
        }
        NormalTrackTimeStamp a2 = C71073b.m125560a(interactStickerStruct);
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
            InteractStickerStruct interactStickerStruct2 = aVar2.f163495b;
            if (interactStickerStruct2 != null) {
                interactStickerStruct2.setTrackList(b);
            }
            AbstractC72865b bVar2 = this.f88236e;
            if (bVar2 != null) {
                bVar2.mo112316b(false);
            }
            AbstractC72865b bVar3 = this.f88236e;
            if (bVar3 != null) {
                bVar3.mo112311a(aVar2.f163495b, false);
            }
            AbstractC72865b bVar4 = this.f88236e;
            if (bVar4 != null) {
                bVar4.mo112316b(true);
            }
        }
    }
}
