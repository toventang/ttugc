package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel;

import android.content.Context;
import com.airbnb.epoxy.AbstractC1944n;
import com.airbnb.epoxy.AbstractC1956s;
import com.airbnb.epoxy.AsyncEpoxyController;
import com.airbnb.epoxy.C1974u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a.C54186b;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GifController */
public final class GifController extends AsyncEpoxyController {
    private final Context context;
    private List<C54186b> data = C89086z.INSTANCE;
    private final AbstractC46519p inputBridge;
    private final GiphyViewModel viewModel;

    static {
        Covode.recordClassIndex(63827);
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<C54186b> getData() {
        return this.data;
    }

    public final AbstractC46519p getInputBridge() {
        return this.inputBridge;
    }

    public final GiphyViewModel getViewModel() {
        return this.viewModel;
    }

    @Override // com.airbnb.epoxy.AbstractC1944n
    public final void buildModels() {
        Iterator<T> it = this.data.iterator();
        while (it.hasNext()) {
            new C54175c(it.next(), this.context, this.inputBridge, this.viewModel).mo5787a((AbstractC1944n) this);
        }
    }

    public final void setData(List<C54186b> list) {
        C89219l.m154721d(list, "");
        this.data = list;
        requestDelayedModelBuild(100);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifController(Context context2, AbstractC46519p pVar, GiphyViewModel giphyViewModel) {
        super(true);
        C89219l.m154721d(context2, "");
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(giphyViewModel, "");
        this.context = context2;
        this.inputBridge = pVar;
        this.viewModel = giphyViewModel;
    }

    @Override // com.airbnb.epoxy.AbstractC1944n
    public final void onModelBound(C1974u uVar, AbstractC1956s<?> sVar, int i, AbstractC1956s<?> sVar2) {
        C89219l.m154721d(uVar, "");
        C89219l.m154721d(sVar, "");
        if (C89070n.m154517a((List) this.data) - i <= 5) {
            this.viewModel.mo91263a(false);
        }
    }
}
