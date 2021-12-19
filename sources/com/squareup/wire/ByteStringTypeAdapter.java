package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import p4632k.C89427i;

class ByteStringTypeAdapter extends AbstractC28031v<C89427i> {
    static {
        Covode.recordClassIndex(35670);
    }

    ByteStringTypeAdapter() {
    }

    @Override // com.google.gson.AbstractC28031v
    public C89427i read(C27897a aVar) {
        if (aVar.mo46627f() != EnumC27899b.NULL) {
            return C89427i.decodeBase64(aVar.mo46629i());
        }
        aVar.mo46631k();
        return null;
    }

    public void write(C27900c cVar, C89427i iVar) {
        if (iVar == null) {
            cVar.mo46654f();
        } else {
            cVar.mo46648b(iVar.base64());
        }
    }
}
