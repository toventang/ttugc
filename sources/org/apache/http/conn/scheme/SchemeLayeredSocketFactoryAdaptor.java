package org.apache.http.conn.scheme;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class SchemeLayeredSocketFactoryAdaptor extends SchemeSocketFactoryAdaptor implements SchemeLayeredSocketFactory {
    private final LayeredSocketFactory factory;

    static {
        Covode.recordClassIndex(106442);
    }

    SchemeLayeredSocketFactoryAdaptor(LayeredSocketFactory layeredSocketFactory) {
        super(layeredSocketFactory);
        this.factory = layeredSocketFactory;
    }
}
