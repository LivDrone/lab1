public interface Loadable<T> {

        //interface för loader metoder.

        void loadOn(T item, double x, double y);
        public T loadOff();
}
