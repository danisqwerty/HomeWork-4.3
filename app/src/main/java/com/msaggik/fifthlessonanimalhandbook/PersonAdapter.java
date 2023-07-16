package com.msaggik.fifthlessonanimalhandbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<Person> people; // поле коллекции контейнера для хранения данных (объектов класса Animal)

    // конструктор адаптера
    public PersonAdapter(Context context, List<Person> people) {
        this.inflater = LayoutInflater.from(context);
        this.people = people;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту Animal
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Animal по определенной позиции
    @Override
    public void onBindViewHolder(PersonAdapter.ViewHolder holder, int position) {
        Person person = people.get(position);
        holder.personView.setImageResource(person.getPersonResource());
        holder.nameView.setText(person.getName());
        holder.personDescriptionView.setText(person.getPersonDescription());
        holder.seiuView.setText(person.getSeiu());
    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return people.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView personView;
        final TextView nameView, personDescriptionView, seiuView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        ViewHolder(View view) {
            super(view);
            personView = view.findViewById(R.id.personResource);
            nameView = view.findViewById(R.id.name);
            personDescriptionView = view.findViewById(R.id.personDescription);
            seiuView = view.findViewById(R.id.seiu);
        }
    }
}
