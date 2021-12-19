package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.ugc.effectplatform.model.c */
public class C86838c {
    private String panel;

    static {
        Covode.recordClassIndex(102563);
    }

    public C86838c() {
        this(null, 1, null);
    }

    public String getPanel() {
        return this.panel;
    }

    public void setPanel(String str) {
        this.panel = str;
    }

    public C86838c(String str) {
        this.panel = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C86838c(String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str);
    }
}
