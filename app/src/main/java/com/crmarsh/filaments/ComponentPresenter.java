package com.crmarsh.filaments;

import static com.google.common.base.Preconditions.checkNotNull;

import android.content.Context;

public abstract class ComponentPresenter<E extends Enum, T extends ComponentData> {
    protected final Context mContext;

    public ComponentPresenter(final Context context) {
        mContext = checkNotNull(context);
    }

    public abstract void onInteract(E interactionType, T props);
}
