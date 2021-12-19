package com.p2082ss.android.ugc.aweme.comment.widgets;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.comment.adapter.AbstractC36212ae;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidgetV2 */
public final class SearchGifWidgetV2 extends BaseSearchGifWidget implements TextWatcher, View.OnClickListener, TextView.OnEditorActionListener, AbstractC20380ar<C37330a>, AbstractC33974au {

    /* renamed from: g */
    private final AbstractC89171a<C89391z> f88068g;

    /* renamed from: h */
    private final AbstractC36212ae f88069h;

    /* renamed from: i */
    private final AbstractC89171a<C89391z> f88070i;

    /* renamed from: j */
    private final String f88071j;

    static {
        Covode.recordClassIndex(44706);
    }

    public final void afterTextChanged(Editable editable) {
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: b */
    public final int mo39079b() {
        return R.layout.ja;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    /* renamed from: l */
    public final void mo64905l() {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    /* renamed from: m */
    public final void mo64906m() {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    /* renamed from: n */
    public final void mo64907n() {
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentJediWidget, com.p2082ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget, com.bytedance.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    /* renamed from: p */
    public final boolean mo64909p() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    /* renamed from: o */
    public final CharSequence mo64908o() {
        return "";
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* synthetic */ C37330a mo33721d() {
        return new C37330a();
    }

    public SearchGifWidgetV2(AbstractC89171a<C89391z> aVar, AbstractC36212ae aeVar, AbstractC89171a<C89391z> aVar2, String str) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aeVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(str, "");
        this.f88068g = aVar;
        this.f88069h = aeVar;
        this.f88070i = aVar2;
        this.f88071j = str;
    }
}
