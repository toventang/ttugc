package com.bytedance.p1777x.p1779b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1777x.AbstractC23681b;
import com.bytedance.p1777x.AbstractC23689c;
import com.bytedance.p1777x.C23698d;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.x.b.f */
public class C23687f implements Serializable, Cloneable {
    public String adSystem;
    public String adTitle;
    public List<C23682a> adVerificationList;
    public List<C23683b> creativeList;
    public String description;
    public Set<String> errorSet;
    public Set<String> impressionSet;
    public Set<String> notViewableSet;
    public String version;
    public Set<String> viewUndeterminedSet;
    public Set<String> viewableSet;

    static {
        Covode.recordClassIndex(27789);
    }

    public Boolean parseContent(String str, int i) {
        return Boolean.valueOf(new C23698d(this).mo39122b(str, i));
    }

    public Boolean parseUri(String str, int i) {
        return Boolean.valueOf(new C23698d(this).mo39121a(str, i));
    }

    public Boolean parseContent(String str, int i, AbstractC23681b bVar) {
        return Boolean.valueOf(new C23698d(this, bVar).mo39122b(str, i));
    }

    public Boolean parseUri(String str, int i, AbstractC23681b bVar) {
        return Boolean.valueOf(new C23698d(this, bVar).mo39121a(str, i));
    }

    public Boolean parseContent(String str, int i, AbstractC23681b bVar, AbstractC23689c cVar) {
        return Boolean.valueOf(new C23698d(this, bVar, cVar).mo39122b(str, i));
    }

    public Boolean parseUri(String str, int i, AbstractC23681b bVar, AbstractC23689c cVar) {
        return Boolean.valueOf(new C23698d(this, bVar, cVar).mo39121a(str, i));
    }
}
