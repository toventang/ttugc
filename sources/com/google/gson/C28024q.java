package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.internal.C28009k;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27901d;
import com.google.gson.p2020c.EnumC27899b;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* renamed from: com.google.gson.q */
public final class C28024q {
    static {
        Covode.recordClassIndex(33637);
    }

    /* renamed from: a */
    public static AbstractC28019l m56139a(String str) {
        return m56138a(new StringReader(str));
    }

    /* renamed from: a */
    private static AbstractC28019l m56138a(Reader reader) {
        try {
            C27897a aVar = new C27897a(reader);
            AbstractC28019l a = m56137a(aVar);
            if (!(a instanceof C28021n)) {
                if (aVar.mo46627f() != EnumC27899b.END_DOCUMENT) {
                    throw new C28027t("Did not consume the entire document.");
                }
            }
            return a;
        } catch (C27901d e) {
            throw new C28027t(e);
        } catch (IOException e2) {
            throw new C28020m(e2);
        } catch (NumberFormatException e3) {
            throw new C28027t(e3);
        }
    }

    /* renamed from: a */
    public static AbstractC28019l m56137a(C27897a aVar) {
        boolean z = aVar.f65506a;
        aVar.f65506a = true;
        try {
            AbstractC28019l a = C28009k.m56099a(aVar);
            aVar.f65506a = z;
            return a;
        } catch (StackOverflowError e) {
            throw new C28023p("Failed parsing JSON source: " + aVar + " to Json", e);
        } catch (OutOfMemoryError e2) {
            throw new C28023p("Failed parsing JSON source: " + aVar + " to Json", e2);
        } catch (Throwable th) {
            aVar.f65506a = z;
            throw th;
        }
    }
}
