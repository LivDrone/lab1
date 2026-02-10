public interface Loadable<T> {
        void loadOn(T item, double x, double y);
        public T loadOff();
}
