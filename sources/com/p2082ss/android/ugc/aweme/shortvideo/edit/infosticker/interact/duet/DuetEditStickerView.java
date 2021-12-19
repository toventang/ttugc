package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.C71136d;
import com.p2082ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.DuetStickerUserStruct;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerView */
public final class DuetEditStickerView extends FrameLayout {

    /* renamed from: e */
    public static final C71115a f159272e = new C71115a((byte) 0);

    /* renamed from: a */
    public boolean f159273a;

    /* renamed from: b */
    List<User> f159274b;

    /* renamed from: c */
    boolean f159275c;

    /* renamed from: d */
    public TuxTextView f159276d;

    /* renamed from: f */
    private ConstraintLayout f159277f;

    /* renamed from: g */
    private C23226a f159278g;

    /* renamed from: h */
    private C71136d f159279h;

    /* renamed from: i */
    private AbstractC89171a<C89391z> f159280i;

    /* renamed from: j */
    private VideoPublishEditModel f159281j;

    static {
        Covode.recordClassIndex(83618);
    }

    public DuetEditStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerView$a */
    public static final class C71115a {
        static {
            Covode.recordClassIndex(83619);
        }

        private C71115a() {
        }

        public /* synthetic */ C71115a(byte b) {
            this();
        }
    }

    public final VideoPublishEditModel getEditModel() {
        return this.f159281j;
    }

    public final List<User> getSelectUser() {
        return this.f159274b;
    }

    public final AbstractC89171a<C89391z> getSheetDismissListener() {
        return this.f159280i;
    }

    public final boolean getTurnOnMic() {
        return this.f159275c;
    }

    public final TuxTextView getDuetTuxText() {
        TuxTextView tuxTextView = this.f159276d;
        if (tuxTextView == null) {
            C89219l.m154710a("duetTuxText");
        }
        return tuxTextView;
    }

    public final float getScaleValue() {
        if (((float) getMeasuredWidth()) > ((float) C30745b.m63131a(getContext())) - C30745b.m63132b(getContext(), 60.0f)) {
            return (((float) C30745b.m63131a(getContext())) - C30745b.m63132b(getContext(), 112.0f)) / ((float) getMeasuredWidth());
        }
        return 1.0f;
    }

    /* renamed from: b */
    private final void m125694b() {
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bjp, this, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) a;
        this.f159277f = constraintLayout;
        if (constraintLayout == null) {
            C89219l.m154710a("container");
        }
        View findViewById = constraintLayout.findViewById(R.id.aq5);
        C89219l.m154716b(findViewById, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        this.f159276d = tuxTextView;
        if (tuxTextView == null) {
            C89219l.m154710a("duetTuxText");
        }
        tuxTextView.setTypeface(C45989b.m88764a().mo77597c("Neon"));
        TuxTextView tuxTextView2 = this.f159276d;
        if (tuxTextView2 == null) {
            C89219l.m154710a("duetTuxText");
        }
        tuxTextView2.mo37697a(30.0f);
        ConstraintLayout constraintLayout2 = this.f159277f;
        if (constraintLayout2 == null) {
            C89219l.m154710a("container");
        }
        addView(constraintLayout2);
    }

    /* renamed from: a */
    public final void mo112396a() {
        Activity activity;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f159274b);
        this.f159279h = new C71136d(linkedHashSet, this.f159275c, this.f159281j);
        C23226a.C23227a a = new C23226a.C23227a().mo37815a(new DialogInterface$OnDismissListenerC71116b(this));
        C71136d dVar = this.f159279h;
        if (dVar == null) {
            C89219l.m154710a("duetRecommendFragmentContent");
        }
        C23226a aVar = a.mo37817a(dVar).f55057a;
        this.f159278g = aVar;
        if (aVar != null) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            while (true) {
                activity = null;
                if (context != null) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        activity = (Activity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            aVar.show(((ActivityC0945e) activity).getSupportFragmentManager(), "DuetSettingDialog");
        }
    }

    public final DuetStickerStruct getDuetStruct() {
        String str;
        ArrayList arrayList = new ArrayList();
        for (T t : this.f159274b) {
            C89219l.m154721d(t, "");
            String nickname = t.getNickname();
            C89219l.m154716b(nickname, "");
            String uniqueId = t.getUniqueId();
            if (uniqueId == null || uniqueId.length() == 0) {
                str = t.getShortId();
            } else {
                str = t.getUniqueId();
            }
            if (str == null || str.length() == 0) {
                if (TextUtils.isEmpty(t.getRemarkName())) {
                    str = t.getNickname();
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = t.getRemarkName();
                    if (str == null) {
                        str = "";
                    }
                }
            }
            UrlModel avatarThumb = t.getAvatarThumb();
            C89219l.m154716b(avatarThumb, "");
            String secUid = t.getSecUid();
            C89219l.m154716b(secUid, "");
            String uid = t.getUid();
            C89219l.m154716b(uid, "");
            arrayList.add(new DuetStickerUserStruct(nickname, str, avatarThumb, secUid, uid));
        }
        boolean z = this.f159275c;
        Context context = getContext();
        C89219l.m154716b(context, "");
        String string = context.getResources().getString(R.string.bdv);
        C89219l.m154716b(string, "");
        return new DuetStickerStruct(arrayList, z, string, null, 8, null);
    }

    public final void setEditCurrentSticker(boolean z) {
        this.f159273a = z;
    }

    public final void setEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.f159281j = videoPublishEditModel;
    }

    public final void setSheetDismissListener(AbstractC89171a<C89391z> aVar) {
        this.f159280i = aVar;
    }

    public final void setTurnOnMic(boolean z) {
        this.f159275c = z;
    }

    public final void setDuetTuxText(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
        this.f159276d = tuxTextView;
    }

    public final void setSelectUser(List<User> list) {
        C89219l.m154721d(list, "");
        this.f159274b = list;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerView$b */
    static final class DialogInterface$OnDismissListenerC71116b implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ DuetEditStickerView f159282a;

        static {
            Covode.recordClassIndex(83620);
        }

        DialogInterface$OnDismissListenerC71116b(DuetEditStickerView duetEditStickerView) {
            this.f159282a = duetEditStickerView;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C89219l.m154716b(dialogInterface, "");
            if (C89219l.m154714a(C23226a.C23228b.m43785a(dialogInterface), C71136d.AbstractC71140b.C71141a.f159366a)) {
                this.f159282a.mo112397a(false);
            } else {
                this.f159282a.mo112397a(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo112397a(boolean z) {
        boolean z2;
        if (z) {
            C71136d dVar = this.f159279h;
            if (dVar == null) {
                C89219l.m154710a("duetRecommendFragmentContent");
            }
            this.f159274b = C89070n.m154585g((Collection) dVar.f159352b.f159295a);
            C71136d dVar2 = this.f159279h;
            if (dVar2 == null) {
                C89219l.m154710a("duetRecommendFragmentContent");
            }
            TuxTextCell tuxTextCell = dVar2.f159354d;
            if (tuxTextCell == null) {
                C89219l.m154710a("useMicSwitch");
            }
            AbstractC23293c.AbstractC23296b accessory = tuxTextCell.getAccessory();
            if (!(accessory instanceof AbstractC23293c.C23309j)) {
                accessory = null;
            }
            AbstractC23293c.AbstractC23299e eVar = (AbstractC23293c.AbstractC23299e) accessory;
            if (eVar != null) {
                z2 = eVar.mo37960g();
            } else {
                z2 = false;
            }
            this.f159275c = z2;
        }
        AbstractC89171a<C89391z> aVar = this.f159280i;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DuetEditStickerView(Context context, VideoPublishEditModel videoPublishEditModel) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13825);
        this.f159274b = new ArrayList();
        this.f159281j = videoPublishEditModel;
        m125694b();
        MethodCollector.m26664o(13825);
    }

    private /* synthetic */ DuetEditStickerView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DuetEditStickerView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13826);
        this.f159274b = new ArrayList();
        m125694b();
        MethodCollector.m26664o(13826);
    }
}
