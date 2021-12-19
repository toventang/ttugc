package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1719f.p1720a.AbstractC23124a;
import com.bytedance.tux.p1719f.p1720a.C23129d;
import com.bytedance.tux.p1719f.p1720a.C23135e;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3574c.C63644a;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3574c.C63645b;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.views.C63679b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel */
public final class ProfileEditPronounsSearchAndDisplayViewModel extends AssemViewModel<C63677b> {

    /* renamed from: r */
    public static final C63668a f144358r = new C63668a((byte) 0);

    /* renamed from: j */
    public final SpannableStringBuilder f144359j = new SpannableStringBuilder();

    /* renamed from: k */
    public final List<String> f144360k = new ArrayList();

    /* renamed from: l */
    public final Map<C63644a, List<String>> f144361l = new LinkedHashMap();

    /* renamed from: m */
    public List<String> f144362m = C89086z.INSTANCE;

    /* renamed from: n */
    public int f144363n = 4;

    /* renamed from: o */
    public Boolean f144364o;

    /* renamed from: p */
    public int f144365p = Integer.MAX_VALUE;

    /* renamed from: q */
    public final Map<Integer, Integer> f144366q = new LinkedHashMap();

    /* renamed from: s */
    private boolean f144367s = true;

    /* renamed from: t */
    private int f144368t;

    static {
        Covode.recordClassIndex(74986);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel$a */
    public static final class C63668a {
        static {
            Covode.recordClassIndex(74987);
        }

        private C63668a() {
        }

        public /* synthetic */ C63668a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C63677b mo20674f() {
        return new C63677b();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        this.f144361l.clear();
        super.onCleared();
    }

    /* renamed from: g */
    private final AbstractC23124a m115207g() {
        int i = this.f144368t;
        this.f144368t = i + 1;
        this.f144366q.put(Integer.valueOf(i), Integer.valueOf(this.f144359j.length() - 1));
        return new C63671c(this, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel$b */
    public static final class C63669b extends AbstractC89220m implements AbstractC89172b<C63677b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileEditPronounsSearchAndDisplayViewModel f144369a;

        static {
            Covode.recordClassIndex(74988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63669b(ProfileEditPronounsSearchAndDisplayViewModel profileEditPronounsSearchAndDisplayViewModel) {
            super(1);
            this.f144369a = profileEditPronounsSearchAndDisplayViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C63677b bVar) {
            C89219l.m154721d(bVar, "");
            this.f144369a.mo20662a(C636701.f144370a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel$c */
    public static final class C63671c extends AbstractC23124a {

        /* renamed from: a */
        final /* synthetic */ ProfileEditPronounsSearchAndDisplayViewModel f144371a;

        /* renamed from: b */
        final /* synthetic */ int f144372b;

        static {
            Covode.recordClassIndex(74990);
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel$c$a */
        static final class C63672a extends AbstractC89220m implements AbstractC89172b<C63677b, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C63671c f144373a;

            static {
                Covode.recordClassIndex(74991);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C63672a(C63671c cVar) {
                super(1);
                this.f144373a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C63677b bVar) {
                C89219l.m154721d(bVar, "");
                this.f144373a.f144371a.mo20662a(C636731.f144374a);
                return C89391z.f203057a;
            }
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            Integer num = this.f144371a.f144366q.get(Integer.valueOf(this.f144372b));
            if (num != null) {
                num.intValue();
                for (Integer num2 : this.f144371a.f144366q.keySet()) {
                    int intValue = num2.intValue();
                    Integer num3 = this.f144371a.f144366q.get(Integer.valueOf(intValue));
                    if (num3 == null) {
                        C89219l.m154715b();
                    }
                    if (num3.intValue() > num.intValue()) {
                        Map<Integer, Integer> map = this.f144371a.f144366q;
                        Integer valueOf = Integer.valueOf(intValue);
                        Integer num4 = this.f144371a.f144366q.get(Integer.valueOf(intValue));
                        if (num4 == null) {
                            C89219l.m154715b();
                        }
                        map.put(valueOf, Integer.valueOf(num4.intValue() - 1));
                    }
                }
                this.f144371a.f144359j.delete(num.intValue(), num.intValue() + 1);
                this.f144371a.f144360k.remove(num.intValue());
                this.f144371a.f144366q.put(Integer.valueOf(this.f144372b), -1);
                this.f144371a.mo20667b(new C63672a(this));
            }
        }

        C63671c(ProfileEditPronounsSearchAndDisplayViewModel profileEditPronounsSearchAndDisplayViewModel, int i) {
            this.f144371a = profileEditPronounsSearchAndDisplayViewModel;
            this.f144372b = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel$e */
    public static final class C63675e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ LinearLayout.LayoutParams f144376a;

        /* renamed from: b */
        final /* synthetic */ int f144377b;

        /* renamed from: c */
        final /* synthetic */ View f144378c;

        static {
            Covode.recordClassIndex(74994);
        }

        C63675e(LinearLayout.LayoutParams layoutParams, int i, View view) {
            this.f144376a = layoutParams;
            this.f144377b = i;
            this.f144378c = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            this.f144376a.topMargin = this.f144377b + intValue;
            this.f144378c.setLayoutParams(this.f144376a);
        }
    }

    /* renamed from: b */
    private static C63679b m115205b(Context context, String str) {
        C63679b bVar = new C63679b(context, (byte) 0);
        bVar.mo102267a(str);
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel$d */
    public static final class C63674d<T> implements Comparator {

        /* renamed from: a */
        public static final C63674d f144375a = new C63674d();

        static {
            Covode.recordClassIndex(74993);
        }

        C63674d() {
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            int i;
            int i2;
            C63645b bVar = (C63645b) obj;
            C63645b bVar2 = (C63645b) obj2;
            if (bVar.f144335b != bVar2.f144335b) {
                i = bVar.f144335b;
                i2 = bVar2.f144335b;
            } else {
                i = bVar.f144336c;
                i2 = bVar2.f144336c;
            }
            return i - i2;
        }
    }

    /* renamed from: a */
    private static C23135e<C63679b> m115203a(Context context, String str) {
        C23135e<C63679b> eVar = new C23135e<>(m115205b(context, str));
        eVar.f54755b = (int) C89393b.m154948a(8.0f);
        return eVar;
    }

    /* renamed from: a */
    private static void m115204a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        int i2 = layoutParams2.topMargin;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
        C89219l.m154716b(ofInt, "");
        ofInt.setDuration(100L);
        ofInt.addUpdateListener(new C63675e(layoutParams2, i2, view));
        ofInt.start();
    }

    /* renamed from: b */
    private final void m115206b(EditText editText, int i) {
        Editable text = editText.getText();
        int selectionEnd = Selection.getSelectionEnd(text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) this.f144359j);
        C89219l.m154716b(text, "");
        append.append((CharSequence) text.subSequence(this.f144359j.length(), i).toString());
        editText.setText(spannableStringBuilder);
        Editable text2 = editText.getText();
        if (selectionEnd > text2.length()) {
            selectionEnd = text2.length();
        }
        Selection.setSelection(text2, selectionEnd);
    }

    /* renamed from: a */
    public final void mo102251a(Context context, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f144359j.append((CharSequence) "*");
            this.f144360k.add(list.get(i));
            C23135e<C63679b> a = m115203a(context, list.get(i));
            AbstractC23124a g = m115207g();
            int length = this.f144359j.length() - 1;
            int length2 = this.f144359j.length();
            this.f144359j.setSpan(a, length, length2, 33);
            this.f144359j.setSpan(g, length, length2, 33);
        }
        this.f144359j.setSpan(new C23129d(71), 0, this.f144359j.length(), 33);
    }

    /* renamed from: a */
    public final void mo102252a(boolean z, View view) {
        if (!C89219l.m154714a((Object) this.f144364o, (Object) true)) {
            if (z) {
                if (!this.f144367s) {
                    this.f144367s = true;
                    m115204a(view, view.getHeight());
                }
            } else if (this.f144367s) {
                this.f144367s = false;
                m115204a(view, -view.getHeight());
            }
        }
    }

    /* renamed from: a */
    public final boolean mo102253a(EditText editText, int i) {
        if (editText.getText().length() <= i) {
            return false;
        }
        m115206b(editText, i);
        return true;
    }
}
